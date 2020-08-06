package streamEx;



import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
    public static void main(String[] args) {
        InetAddress ia = null;
        Socket sock = null;
        PrintWriter out = null;
        Scanner sc = new Scanner(System.in);

        try {
            while (true){
            ia = InetAddress.getByName("ip주소");
            sock = new Socket(ia, 포트번);
            out = new PrintWriter(sock.getOutputStream(), true);
            System.out.println("서버에게 보내는 문자열: ");
            String msg = sc.nextLine();호
            out.println(msg + "\n");
            out.flush();
            out.close();
        }
    }catch(IOException e){
        System.out.println("접속 오류: " + e.getMessage());
    }finally {
            sc.close();
        }

    }
}