package test.oracle;

import java.sql.*;
import java.util.Scanner;

public class GetTest {
    public static void main(String[] args) {
        //test 테이블 모든 정보 출력
        //id를 입력 받아 정보를 출력
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "호스트";
            String user = "id", pw = "password";
            Connection conn = DriverManager.getConnection(url, user, pw);

            Scanner scanner = new Scanner(System.in);
            System.out.print("id를 입력: ");

            String id = scanner.nextLine();

            String sql = "select * from test where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, id);

            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {
                String Id = rs.getString("id");
                String password = rs.getString("password");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Timestamp reg = rs.getTimestamp("reg");

                System.out.println("아이디: " + Id);
                System.out.println("비밀번호: " + password);
                System.out.println("이름: " + name);
                System.out.println("나이: " + age);
                System.out.println("가입일: " + reg);
            }
            conn.close();
            pstmt.close();
            rs.close();
        }catch(Exception e){

        }
    }
}
