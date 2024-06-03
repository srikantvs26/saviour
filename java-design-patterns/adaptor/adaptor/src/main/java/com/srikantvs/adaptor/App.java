package com.srikantvs.adaptor;

import java.io.File;
import java.io.IOException;

import org.springframework.util.ResourceUtils;
import org.w3c.dom.Text;

import com.opencsv.exceptions.CsvException;

public class App {
    public static void main(String[] args) throws IOException, CsvException {
        
        File file1 = ResourceUtils.getFile("classpath:test.csv");
        TextFileReader textFileReader = new TextFileReader();
        textFileReader.readTXT(file1);

        System.out.println("=====================================================================");
        File file2 = ResourceUtils.getFile("classpath:test.txt");
        CSVFileReader csvFileReader = new CSVFileReader();
        csvFileReader.readCSV(file2);

        // Using Adapter
        CSVFileReaderAdapter csvFileReaderAdapter = new CSVFileReaderAdapter(csvFileReader);
        csvFileReaderAdapter.readTXT(file2);


    }
}
