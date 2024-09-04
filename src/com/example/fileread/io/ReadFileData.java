package com.example.fileread.io;

import java.io.*;

public class ReadFileData {
    // define a method that reads the file and
    // return a StringBuilder which contains file data
    public StringBuilder readData(String fileName)
            throws FileNotFoundException, IOException {
        StringBuilder fileData = new StringBuilder();
        // reading the file data
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        //read line by line
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        fileData.append(line);
        return fileData;
    }
}
