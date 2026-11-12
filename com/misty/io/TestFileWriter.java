package com.misty.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main() {
        try {
            FileWriter fw = new FileWriter("/Users/misty/Documents/newfile.txt");
            fw.write("This is a test.");
            fw.write("\r\n");
            fw.write("This is another test.");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
