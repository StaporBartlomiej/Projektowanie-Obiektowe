package service;

import lombok.Value;

import java.io.*;


@Value
public class FileOperations {

    private final String fileName;

    public FileOperations(String fileName) {
        this.fileName = fileName;
    }

    public static BufferedReader getBufferedReader(String fileName) {
        try {
            File inputF = new File(fileName);
            InputStream inputFS = new FileInputStream(inputF);
            return new BufferedReader(new InputStreamReader(inputFS));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}