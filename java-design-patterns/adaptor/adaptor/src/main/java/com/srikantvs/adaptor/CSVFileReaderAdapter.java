package com.srikantvs.adaptor;

import java.io.File;
import java.io.IOException;

import com.opencsv.exceptions.CsvException;

public class CSVFileReaderAdapter {

    public TextFileReader textFileReader;

    CSVFileReaderAdapter(TextFileReader textFileReader){
        this.textFileReader = textFileReader;
    }

    public void readTXT(File file) throws IOException, CsvException {
        // conversion
        textFileReader.readTXT(file);
    }

    

}
