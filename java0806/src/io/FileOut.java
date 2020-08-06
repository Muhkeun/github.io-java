package io;

import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOut {
    public static void main(String[] args) {
        try{
            //파일을 생성
            FileOutputStream fos = new FileOutputStream("생성할 파일의 경로");
            //스캐너로 입력을 받아 str에 대입
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            //str의 byte를 배열 bytes에 대입
            byte [] bytes = str.getBytes();
            //bytes를 쓰기
            fos.write(bytes);

            System.out.println("파일이 성공적으로 생성되었습니다.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
