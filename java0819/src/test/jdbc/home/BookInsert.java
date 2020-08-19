package test.jdbc.home;

import org.apache.ibatis.session.SqlSession;
import test.jdbc.bean.BookDTO;
import test.jdbc.bean.MybatisConnectionFactory;

import java.util.Scanner;

public class BookInsert{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("저자: ");
        String writer = in.nextLine();
        System.out.print("제목: ");
        String title = in.nextLine();
        System.out.print("내용: ");
        String content = in.nextLine();
        BookDTO dto = new BookDTO();
        dto.setWriter(writer);
        dto.setContent(content);
        dto.setTitle(title);


        SqlSession sql = MybatisConnectionFactory.getSqlSession();
        sql.insert("book.bookInsert", dto);
        sql.close();
        System.out.println("저장되었습니다.");
    }
}