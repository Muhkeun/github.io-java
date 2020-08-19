package test.jdbc.home;

import org.apache.ibatis.session.SqlSession;
import test.jdbc.bean.BookDTO;
import test.jdbc.bean.MybatisConnectionFactory;
import java.util.List;


public class BookSelect {
    public static void main(String[] args) {
        SqlSession sql = MybatisConnectionFactory.getSqlSession();
        List all = sql.selectList("book.bookIf", 3);
        for(int i = 0; i < all.size(); i++){
            BookDTO dto = (BookDTO)all.get(i);
            System.out.println(dto.getWriter()+ " : " +
                               dto.getTitle());
        }
    }
}
