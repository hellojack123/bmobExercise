package com.example.bmobexercise.model.bean;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;

public class Post extends BmobObject {

    private /*static*/ String content;
    private /*static*/ MyUser author;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public MyUser getAuthor() {
        return author;
    }

    public void setAuthor(MyUser author) {
        this.author = author;
    }

}
