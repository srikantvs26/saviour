package com.srikantvs.adaptor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

public class CSVFileReader {

    public void readCSV(File file) throws IOException, CsvException {
        
        CSVReader reader = new CSVReaderBuilder(new FileReader(file)).build();
        List<String[]> myEntries = reader.readAll();

        System.out.println(myEntries.get(0)[1]);

        List<List<String>> fileData = myEntries.stream()
                .map(strArr -> Arrays.asList(strArr))
                .collect(Collectors.toList());

        for (List<String> list : fileData) {
            System.out.println(list);
        }

    }
}
