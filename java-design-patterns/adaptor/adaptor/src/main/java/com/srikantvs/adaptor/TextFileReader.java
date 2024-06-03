package com.srikantvs.adaptor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.stream.Collectors;

import com.opencsv.exceptions.CsvException;

public class TextFileReader {

    public void readTXT(File file) throws IOException, CsvException{

        System.out.println(System.getProperty("user.dir"));
        
        Reader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
        System.out.println(lines);

        bufferedReader.close();

    }
}
