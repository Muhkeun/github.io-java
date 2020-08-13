package test.oracle;

import java.sql.*;
import java.util.Scanner;

public class EmpNo {
    public static void main(String[] args) {
        //사원번호를 입력하여 해당하는 정보를 출력하는 코드
        try {
            //드라이버 생성
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //DB 연결
            String url = "호스트";
            String user = "아이디", pw = "비밀번호";
            Connection conn = DriverManager.getConnection(url, user, pw);

            //스캐너 객체 생성
            Scanner scanner = new Scanner(System.in);
            System.out.print("사원번호 입력: ");

            //변수 empno에 입력받은 값 (사원번호) 대입
            int empno = scanner.nextInt();

            //sql문 안에 ?를 대입하면 아직 값을 받지 않을거란 뜻 (미완성)
            String sql = "select * from emp where empno = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            //setInt(index , x): index번째 ?에 x(int type)를 대입
            pstmt.setInt( 1, empno);

            //실행결과를 rs에 저장
            //사원번호는 primary key이기 때문에 하나 밖에 안나옴 => 반복 필요없음.
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
             String ename = rs.getString("ename");
             String job = rs.getString("job");
             int mgr = rs.getInt("mgr");
             Timestamp hiredate = rs.getTimestamp("hiredate");
             int sal = rs.getInt("sal");

             System.out.println(
                             "이름: " + ename +
                             "\n직무:  " + job +
                             "\n관리자: " + mgr +
                             "\n입사일: " + hiredate +
                             "\n월급 : $" + sal
             );

             rs.close();
             pstmt.close();
             conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
