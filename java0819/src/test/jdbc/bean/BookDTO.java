package test.jdbc.bean;

import java.sql.Timestamp;

public class BookDTO {
//    컬럼 = 자바변수
    private int num;
    private String writer;
    private String title;
    private String content;
    private Timestamp reg;

    //getters setters 세팅 (캡슐화)
    public void setNum(int num){
        this.num = num;
    }
    public void setWriter(String writer){
        this.writer = writer;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setContent (String content){
        this.content = content;
    }
    public void setReg(Timestamp reg){
        this.reg = reg;
    }
    public int getNum(){
        return num;
    }
    public String getWriter(){
        return writer;
    }
    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
    public Timestamp getReg() {
        return reg;
    }
}
