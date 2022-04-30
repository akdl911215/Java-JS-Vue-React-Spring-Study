package univer.ch08;

import java.io.File;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try {
            File inFile, outFile;
            inFile = new File("c:\\Java\\FileInputStreamTest.java");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
