package Review0807;


import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class TCPUser {
    public static void main(String[] args) {
        try{
            Socket user = new Socket("192.168.0.38", 7777);
            Socket user = new Socket("아이피주소" , 포트번호);
            InputStream is = user.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            Date day = (Date)ois.readObject();
            System.out.println("시간: " + day);
            ois.close();
            user.close();
        }catch (Exception e){
            System.out.println("포트번호가 잘못 입력되었습니다.");
        }
    }
}
