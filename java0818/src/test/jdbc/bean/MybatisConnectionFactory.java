package test.jdbc.bean;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.Reader;

public class MybatisConnectionFactory {
    //xml 파일에 접근할 클래스
    private static SqlSessionFactory sqlSessionFactory;

    //class 초기화 블럭
    static {
        // 접속 정보 및 mybatis 설정을 명시하고 있는 xml 경로를 읽기
        try {
            Reader reader =
                    Resources.getResourceAsReader("test/jdbc/mybatis/mybatis_config.xml");
            if(sqlSessionFactory == null){
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSessionFactory(){
        //하나의 세션을 리턴
        return sqlSessionFactory.openSession();
    }
}
