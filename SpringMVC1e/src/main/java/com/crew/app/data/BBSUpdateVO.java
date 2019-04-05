package com.crew.app.data;

public class BBSUpdateVO {

	//게시물 아이디
    private Integer id;
    //작성자 이름
    private String name;
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
