/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsontocsv;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.annotation.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
/**
 *
 * @author BuNty
 */
public class JsonRead {
    public static void main(String arg[]) throws IOException, FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        File file = new File("test.properties");
        FileInputStream fileInput = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInput);
        fileInput.close();              
        String JFile =(String) properties.getProperty("JsonFile");
        String CFile =(String) properties.getProperty("CsvFile");
        String userid =(String) properties.getProperty("userid");
        String password =(String) properties.getProperty("password");
        File JsonFile = new File(JFile);
        ObjectMapper mapper = new ObjectMapper();
        MyJson ob = null;
        System.out.println(password);
        ob = mapper.readValue(JsonFile,MyJson.class);
        List ls = ob.getResults();
        CsvFileWriter.readCsvFile(CFile, ls);
        CsvToDatabase.csvToDbWriter(CFile,userid,password);
    }
}
