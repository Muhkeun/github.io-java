package io;

import java.io.File;

public class FileEx2 {
    public static void main(String[] args) {
        File f = new File("디렉토리경로");
        //디렉토리 내부의 모든 파일의 이름을 리스트에 넣을 수 있다.
        String [] fileList = f.list();
        for(String name : fileList){
            System.out.println(name);
        }
    }
}
