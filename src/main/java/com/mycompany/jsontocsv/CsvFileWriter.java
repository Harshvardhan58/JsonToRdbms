/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsontocsv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
/**
 *
 * @author BuNty
 */
public class CsvFileWriter {
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final Object [] FILE_HEADER = {"receivedate","transmissiondate","fulfillexpeditecriteria","receiptdate","transmissiondateformat","receiptdateformat","receiver","serious","receivedateformat","companynumb","safetyreportid"};
   public static void readCsvFile(String fileName, List<Results> ResultList) throws IOException {
       FileWriter fileWriter = null;
       CSVPrinter csvFilePrinter = null;
       CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator(NEW_LINE_SEPARATOR);
       fileWriter = new FileWriter(fileName);
       csvFilePrinter = new CSVPrinter(fileWriter, csvFileFormat);
       csvFilePrinter.printRecord(FILE_HEADER);
       for (Results rs : ResultList) {
           List record = new ArrayList();
           record.add(rs.getReceivedate());
           record.add(rs.getTransmissiondate());
           record.add(rs.getFulfillexpeditecriteria());
           record.add(rs.getReceiptdate());
           record.add(rs.getTransmissiondateformat());
           record.add(rs.getReceiptdateformat());
           record.add(rs.getReceiver());
           record.add(rs.getSerious());
           record.add(rs.getReceivedateformat());
           record.add(rs.getCompanynumb());
           record.add(rs.getSafetyreportid());
           csvFilePrinter.printRecord(record);
       }
       fileWriter.flush();
       fileWriter.close();
       csvFilePrinter.close();
   }
}
