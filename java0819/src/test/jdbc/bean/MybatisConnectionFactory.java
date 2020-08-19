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
            //sql 정보를 읽어옴
            Reader reader =
                    Resources.getResourceAsReader("test/jdbc/mybatis/mybatis_config.xml");
            if(sqlSessionFactory == null){
                //작업할 수 있는 용도로 생성해준다.
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        //하나의 세션을 리턴
        // (true)값을 넣어주면 오토커밋
       return sqlSessionFactory.openSession(true);


    }
}
