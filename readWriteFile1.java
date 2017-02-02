package com.java.training;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;
/**
 * Created by anchalmal on 2/1/17.
 */
public class readWriteFile1 {


    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("file1"));
        bw.write("string to be copied\n");
        bw.close();
        InputStream in = new FileInputStream(new File("file1"));
        OutputStream out = new FileOutputStream(new File("file2"));
        byte[] buf = new byte[1024];
        int len;

        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
        BufferedReader br = new BufferedReader(new FileReader("file2"));
        String s;

        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        in.close();
    }
}
