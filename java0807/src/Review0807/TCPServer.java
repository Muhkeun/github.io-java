package Review0807;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCPServer {
    public static void main(String[] args) {
        try {
            //소켓 생성 => ServerSocket(PortNum);
            ServerSocket ss = new ServerSocket(7777);
            while (true){
                //연결
                //user : 접속한 사용자 정보
                Socket user = ss.accept();
                OutputStream os =user.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                //전송
                oos.writeObject(new Date());
                FileOutputStream log = new FileOutputStream("파일경로" );
                Date date = new Date();
                String str = date.toString() + " " +  user.toString();
                byte [] bytes = str.getBytes();
                log.write(bytes);
                oos.flush();
                //연결 종료
                oos.close();
                user.close();


            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
