package com.crew.app.data;

public class BBSUpdateVO {

	//게시물 아이디
    private Integer id;
    //작성자 이름
    private String name;
    //작성자 이메일
    private String email;
    //게시글 비밀 번호
    private String pass;
    //게시물 제목
    private String title;
    //게시물 내용
    private String comment;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    
}
