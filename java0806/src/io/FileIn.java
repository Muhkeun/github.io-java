package io;

import java.io.FileInputStream;

public class FileIn {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("파일경로");
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char)i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
