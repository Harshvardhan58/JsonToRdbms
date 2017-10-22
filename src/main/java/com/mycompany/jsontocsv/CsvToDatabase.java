/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsontocsv;

/**
 *
 * @author BuNty
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CsvToDatabase {
    private static final String [] FILE_HEADER_MAPPING = {"receivedate","transmissiondate","fulfillexpeditecriteria","receiptdate","transmissiondateformat","receiptdateformat","receiver","serious","receivedateformat","companynumb","safetyreportid"};
    private static PreparedStatement ps=null;
    public static void csvToDbWriter(String fileName,String username,String password) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        String DB_URL = "jdbc:mysql://localhost:3306/testdb";
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        //System.out.println(username+"  :"+password);
        Connection conn = DriverManager.getConnection(DB_URL,username,password);
        String sql = "INSERT INTO testtable(receivedate,transmissiondate,fulfillexpeditecriteria,receiptdate,transmissiondateformat,receiptdateformat,receiver,serious,receivedateformat,companynumb,safetyreportid) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        ps = (PreparedStatement) conn.prepareStatement(sql);
        FileReader fileReader = null;	
        CSVParser csvFileParser = null;
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withHeader(FILE_HEADER_MAPPING);
        fileReader = new FileReader(fileName);
        csvFileParser = new CSVParser(fileReader, csvFileFormat);
        List csvRecords = csvFileParser.getRecords();
        for (int i = 1; i < csvRecords.size(); i++) {
            CSVRecord record = (CSVRecord) csvRecords.get(i);
           //System.out.println(rs.getReceivedate());
            databaseWriter(conn,record);
        }
        fileReader.close();
        csvFileParser.close();
        conn.close();
    }
    static public void databaseWriter(Connection conn, CSVRecord record) throws SQLException{
         //stmt = conn.createStatement();
         //String sql = "INSERT INTO testtable(receivedate,transmissiondate,fulfillexpeditecriteria,receiptdate,transmissiondateformat,receiptdateformat,receiver,serious,receivedateformat,companynumb,safetyreportid) VALUES ('\"+rs.getReceivedate()+"'\,'"+rs.getTransmissiondate()+"','"+rs.getFulfillexpeditecriteria()+"','"+rs.getReceiptdate()+"','"+rs.getTransmissiondateformat()+"','"+rs.getReceiptdateformat()+"','"+rs.getReceiver()+"','"+rs.getSerious()+"','"+rs.getReceivedateformat()+"','"+rs.getCompanynumb()+"','"+rs.getSafetyreportid()"')";
        
        ps.setString (1,record.get("receivedate"));
        ps.setString (2,record.get("transmissiondate"));
        ps.setString (3,record.get("fulfillexpeditecriteria"));
        ps.setString (4,record.get("receiptdate"));
        ps.setString (5,record.get("transmissiondateformat"));
        ps.setString (6,record.get("receiptdateformat"));
        ps.setString (7,record.get("receiver"));
        ps.setString (8,record.get("serious"));
        ps.setString (9,record.get("receivedateformat"));
        ps.setString (10,record.get("companynumb"));
        ps.setString (11,record.get("safetyreportid"));
        ps.executeUpdate();
    }
}
