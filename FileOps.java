package com.java.training;

/**
 * Created by anchalmal on 1/31/17.
 */
    import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

    public class FileOps {
        public static void main(String[] args) throws Exception{

            createFile();

            writeToFile_bufferedWriter("/Users/raviagrawal/fileFolder/file1.txt");

            writeToFile_printWriter("/Users/raviagrawal/fileFolder/file1.txt");

            readFromFile("/Users/raviagrawal/fileFolder/file1.txt");
        }

        static void readFromFile(String fileName) throws Exception{

            File f = new File(fileName);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String s;
            while( (s = br.readLine()) != null){
                System.out.println(s);
            }
            fr.close();
            br.close();
        }

        static void writeToFile_bufferedWriter(String fileName) throws Exception{
            File f = new File(fileName);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("test line 1");
            bw.write("test line 2");

            fw.flush();
            bw.flush();

            fw.close();
            bw.close();
        }

        static void writeToFile_printWriter(String fileName) throws Exception{
            File f = new File(fileName);
            PrintWriter pw = new PrintWriter(f);
            pw.println("test line 3");
            pw.println("test line 4");
            pw.flush();
            pw.close();
        }

        static void createFile() throws Exception{

            File dir = new File("/Users/raviagrawal/fileFolder");

            if(!dir.exists()){
                dir.mkdir();
            }

            File f1 = new File(dir, "file1.txt");
            f1.createNewFile();

            File f2 = new File(dir, "file2.txt");
            f2.createNewFile();

            File renamedFile = new File(dir, "renamedF2.txt");
            f2.renameTo(renamedFile);
        }
    }
