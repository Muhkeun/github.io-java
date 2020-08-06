package io;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File f = new File("파일 경로");
        System.out.println("읽기 가능 여부: " + f.canRead());
        System.out.println("쓰기 가능 여부: " + f.canWrite());
        System.out.println("실행 가능 여부: " + f.canExecute());
        System.out.println("파일 이름: " + f.getName());
        System.out.println("파일 경로: " + f.getAbsolutePath());
        System.out.println("파일 크기: " + f.length());
        System.out.println("파일 숨김: " + f.isHidden());

        //파일 삭제
        //f.delete();


    }
}
