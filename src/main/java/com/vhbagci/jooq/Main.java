package com.vhbagci.jooq;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;

import static com.vhbagci.jooq.model.Tables.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String user = "root";
        String password = "wow123";
        String url = "jdbc:mysql://localhost:3306/library?serverTimezone=UTC&autoReconnect=true&useSSL=false";
        String driver = "com.mysql.cj.jdbc.Driver";

        Class.forName(driver).newInstance();
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            DSLContext dslContext = DSL.using(connection, SQLDialect.MYSQL);
            Result<Record> result = dslContext.select().from(AUTHOR).fetch();

            for (Record r : result) {
                Integer id = r.getValue(AUTHOR.ID);
                String firstName = r.getValue(AUTHOR.FIRST_NAME);
                String lastName = r.getValue(AUTHOR.LAST_NAME);

                System.out.println("ID: " + id + " first name: " + firstName + " last name: " + lastName);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
