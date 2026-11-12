package com.misty.io;

import java.io.*;

public class TestBuffered {
    public static void main() {
        try {
            FileWriter fw = new FileWriter("/Users/misty/Documents/newfile.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 10; i++) {
                bw.write(Math.random() + "");
                bw.newLine();
            }
            bw.close();
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("/Users/misty/Documents/newfile.txt"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
