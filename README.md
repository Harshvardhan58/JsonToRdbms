This project is to read Json file and Save it to csv file, then using this csv file store data to RDBMS.

Stages:

    1. Read Json File and Parse it to Java Object.    --Completed
    
    2. Store the Parsed Json into csv file.           --Completed
    
    3. Read csv file and store the data to RDBMS.     --Completed
    
Description:
    This project is done using maven for dependencies and File names and Configuration will be input by using properties file. 
    
Requirements:
    
    -Sql File is attached with it to create database and table required.
    
    -Maven

Steps:

    - Create database and table using the given sql file.
    
    -properties file settings
        JsonFile = [filename.json]  #json file
        CsvFile = [filename.csv]    #name of csv file
        userid = [username]         #database username/userid
        password = [password]       #database password
        
    
    -maven build/run
        $ mvn clean
        $ mvn compile
        $ mvn exec:java -Dexec.mainClass=com.mycompany.jsontocsv.JsonRead