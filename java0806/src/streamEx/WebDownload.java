package streamEx;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


public class WebDownload {
    public static void main(String[] args) {
        //Stream - 단방향,Que (먼저 들어간 게 먼저 나온다)
        //TCP 프로토콜을 이용하는 Socket
        //상대방에게 연결을 요청하고 상대방이 허락하면 데이터를 전송하고
        //데이터의 수신 여부를 송신하는 측에 알려주는 방식
        //연결을 한 상태에서 통신하므로 안정적, but 연결유지 => 트래픽비용 발생

        InetAddress ia = null;
        Socket sock = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try{
            ia = InetAddress.getByName("www.daum.net");
            sock = new Socket(ia, 80);
            out = new PrintWriter(new BufferedWriter(
                    new OutputStreamWriter(sock.getOutputStream())));
            out.println("GET http://www.daum.net");
            out.flush();
            in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            while (true){
                String str = in.readLine();

                if(str == null)
                    break;
                    System.out.println(str);
            }
            in.close();
            out.close();
            sock.close();
        } catch (IOException e) {
            System.out.println("데이터 가져오기 실패: " + e.getMessage());
        }
    }
}
