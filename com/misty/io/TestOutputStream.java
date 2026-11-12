package com.misty.io;

import java.io.*;

public class TestOutputStream {
    public static void main() {
        File file = new File("/Users/misty/Documents/coding_test.txt");
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            FileInputStream fis = new FileInputStream("/Users/misty/Documents/newfile.txt");
            FileOutputStream fos = new FileOutputStream("/Users/misty/Documents/coding_test.txt");
            int a;
            while((a = fis.read()) != -1) {
                fos.write(a);
            }
            fis.close();
            fos.close();  
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
