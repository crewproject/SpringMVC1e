package com.crew.app.data;

public class BBSUpdateVO {

	//게시물 아이디
    private Integer id;
    //게시물 제목
    private String title;
    //게시물 내용
    private String comment;
    
    public BBSUpdateVO() {};
    
    public BBSUpdateVO(Integer id, String title, String comment) {
		this.id = id;
		this.title = title;
		this.comment = comment;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
