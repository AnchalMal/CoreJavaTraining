package com.java.training;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class readWriteFile {
    public static void main(String[] args) {

        InputStream inStream = null;
        OutputStream outStream = null;
        createFile();
        writeToFile_bufferedWriter("/Users/anchalmal/Projects/file1.txt");


        try {

            File file1 = new File("/Users/anchalmal/Projects/file1.txt");
            File file2 = new File("/Users/anchalmal/Projects/file2.txt");

            inStream = new FileInputStream(file1);
            outStream = new FileOutputStream(file2);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = inStream.read(buffer)) > 0) {

                outStream.write(buffer, 0, length);

            }

            inStream.close();
            outStream.close();

            System.out.println("File is read write complete");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void createFile() {

        File dir = new File("/Users/anchalmal/Projects");

        if (!dir.exists()) {
            dir.mkdir();
        }
        try {
            File f1 = new File(dir, "file1.txt");
            f1.createNewFile();

            File f2 = new File(dir, "file2.txt");
            f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();


        }
    }

    static void writeToFile_bufferedWriter(String fileName) {
        File f = new File(fileName);

        try{
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

            bw.write("test line 1");
            bw.write("test line 2");
            fw.flush();
            bw.flush();

            fw.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
