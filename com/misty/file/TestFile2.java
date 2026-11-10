package com.misty.file;
import java.io.File;

public class TestFile2 {
    public static void main() {
        File root = new File("/Users/misty/Documents/");
        System.out.println(root.getName());
        loadFiles(root, 0);
    }

    public static void loadFiles(File file, int level) {
        String gap = "   ";
        for (int i = 0; i < level; i++){
            gap += "   ";
        }
        File[] fs = file.listFiles();
        for (int i = 0; i < fs.length; i++) {
            File f = fs[i];
            System.out.println(gap + f.getName());
            if (f.isDirectory()){
                loadFiles(f, level + 1);
            }
        }
    }
}
