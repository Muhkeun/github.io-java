package test.oracle;

//jdbc를 빌드패스하면 import 할 수 있다.
import oracle.jdbc.driver.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
    public static void main(String[] args) {
        try {
            //class.forName: 클래스 이름으로 드라이브를 실행(로딩) 시킨다.
            // => 1) Oracle JDBC를 실행
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //2) 연결 (DB 로그인)
            //jdbc:oracle:{driver}:@{host}:{port}/{ServiceName}
            String url = "호스트";
            String user = "아이디" , pw = "비밀번호";
            Connection conn = DriverManager.getConnection(url, user,pw);

            //3) Query 작성
            //preparedStatement: 여러 개의 query문을 실행 => 요청시 재사용, 실시간 대응 불가
            //Statement: 하나의 query문을 실행 => 요청 할 때마다 실행
            //sql 패키지 import
            PreparedStatement pstmt =
                    conn.prepareStatement("select * from dept");

            //4) Query문 실행 단계
            //insert, update, delete는 아무 내용도 리턴 되지 않는다
            //executeQuery : select 사용 =>테이블 실행 결과를 리턴
            //executeUpdate: select 제외 나머지에 사용 => 실행 결과 없음.
            ResultSet rs = pstmt.executeQuery();

            //5) 출력 단계
            while(rs.next()){
                //getString
                //getInt
                //getTimeStamp
                int deptno = rs.getInt ("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString ("loc");
                System.out.println(deptno + "-" + dname + "-" + loc);

            }

            conn.close();
            rs.close();
            pstmt.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
