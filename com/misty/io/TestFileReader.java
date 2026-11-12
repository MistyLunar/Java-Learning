package com.misty.io;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;

//中文不会乱码
public class TestFileReader {
    public static void main() {
        try {
            FileReader fr = new FileReader("/Users/misty/Documents/newfile.txt");
            int a;
            while((a = fr.read()) != -1) {
                System.out.print((char)a);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
