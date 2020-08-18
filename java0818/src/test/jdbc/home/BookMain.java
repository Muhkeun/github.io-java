package test.jdbc.home;

import org.apache.ibatis.session.SqlSession;
import test.jdbc.bean.MybatisConnectionFactory;

public class BookMain {
    public static void main(String[] args) {
        SqlSession sql = MybatisConnectionFactory.getSqlSessionFactory();
        int count = sql.selectOne("book.bookCount");
        System.out.println("책 전체수: " + count );
        sql.close();
    }
}
