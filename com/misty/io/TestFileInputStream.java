package com.misty.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestFileInputStream {
    public static void main() {
        try {
            InputStream is = new FileInputStream("/Users/misty/Documents/newfile.txt");
            int a;
            while((a = is.read()) != -1) {
                System.out.print((char)a);
            }
            is.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
