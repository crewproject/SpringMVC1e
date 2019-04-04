package com.crew.app.data;

public class BBSOneVO {

	//게시물 아이디
    private Integer id;
    //작성자 이름
    private String name;
    //게시물 비밀번호
    private String pass;
    //게시물 제목
    private String title;
    //게시물 내용
    private String comment;
    //게시물 작성일
    private String wdate;
    //조회수
    private Integer see;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getWdate() {
        return wdate;
    }

    public void setWdate(String wdate) {
        this.wdate = wdate;
    }

    public Integer getSee() {
        return see;
    }

    public void setSee(Integer see) {
        this.see = see;
    }
    
}
