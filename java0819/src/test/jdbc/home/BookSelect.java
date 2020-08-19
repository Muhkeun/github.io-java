package test.jdbc.home;

import org.apache.ibatis.session.SqlSession;
import test.jdbc.bean.BookDTO;
import test.jdbc.bean.MybatisConnectionFactory;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;


public class BookSelect {
    public static void main(String[] args) {
        SqlSession sql = MybatisConnectionFactory.getSqlSession();

        BookDTO d2 = new BookDTO();
        d2.setNum(2);
        d2.setWriter("SunmicroSystem");
        d2.setTitle("Java");
        sql.update("bookMapper.bookUpdate", d2);


        BookDTO d  = new BookDTO();
        List all = sql.selectList("bookMapper.bookTrim", d);
        for(int i = 0; i < all.size(); i++){
            BookDTO dto = (BookDTO)all.get(i);
            System.out.println(dto.getNum() + " - " + dto.getWriter()+ " : " +
                               dto.getTitle());
        }

        List data = new ArrayList();
        data.add("Microsoft"); data.add("Muhkeun"); data.add("Netescape");

        List all2 = sql.selectList("bookMapper.bookFor", data);

        for(int i = 0; i < all2.size(); i++){
            BookDTO dto = (BookDTO)all2.get(i);
            System.out.println(dto.getNum() + " - " + dto.getWriter() + " = " + dto.getTitle());
        }
    }
}
