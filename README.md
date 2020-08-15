# Simple JOOQ Example
1. Run docker-compose.yml file by typing the following command at the root directory.
    ```bash
    docker-compose up
    ``` 
1. Once the local mysql database is up and running, manually apply the create_db.sql
script to create the database "library", the table "author" with 2 sample records in it.

1. Run maven compilation to trigger JOOQ autogen tool to create auto generated classes
representing the library database.
    ```bash
    mvn clean compile
    ``` 
1. Finally, run the com.vhbagci.jooq.Main class to run the sample code that connects to local database
and query the data using JOOQ.