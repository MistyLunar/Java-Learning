package com.misty.file;
import java.io.File;
import java.io.IOException;

public class TestFile1 {
    public static void main() {
        //File file = new File("/Users/misty/Documents/newfile.txt");
        String sep = File.separator;
        //System.out.println(sep);
        String path = sep + "Users" + sep + "misty" + sep + "Documents" + sep + "newfile.txt";
        System.out.println(path);
        File file = new File(path);
        System.out.println(file);
        if (file.exists()){
            System.out.println("文件存在");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
            System.out.println(file.length());
        }else{
            System.out.println("文件不存在");
            // 获取父路径
            File parent = file.getParentFile();//  /Users/misty/Documents
            //创建一系列的文件夹
            parent.mkdirs();
            //创建文件
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
