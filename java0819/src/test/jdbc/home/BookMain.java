package test.jdbc.home;

import org.apache.ibatis.session.SqlSession;

import test.jdbc.bean.BookDTO;
import test.jdbc.bean.MybatisConnectionFactory;
import java.util.List;
import java.util.Scanner;

public class  BookMain {
    public static void main(String[] args) {
        SqlSession sql = MybatisConnectionFactory.getSqlSession();
       int count = sql.selectOne("book.bookCount");

       //sql.selectList() => 쿼리문을 보았을 때 레코드가 여러 개가 나올 수 있으면 사용
        System.out.println("책 전체수: " + count);

        //여러 개의 DTO로 리턴해주기 때문에 리스트에 넣어서 사용
        List all = sql.selectList("book.bookAll");

        if(all != null) {
            for (int i = 0; i < all.size(); i++) {
                BookDTO dto = (BookDTO) all.get(i);
                System.out.println(dto.getNum() + " - " + dto.getWriter());
            }
        }
        System.out.println("===========================================");

        Scanner in = new Scanner(System.in);
        System.out.print("찾을 책의 num을 입력: ");
        try {
            BookDTO dto = sql.selectOne("book.bookNum", in.nextInt());
            System.out.println("찾을 책의 정보: " + dto.getNum() + " - " + dto.getWriter());
        }catch (Exception e){
            System.out.println("해당 번호의 책을 찾을 수 없습니다.");
        }
        sql.close();
    }
}
