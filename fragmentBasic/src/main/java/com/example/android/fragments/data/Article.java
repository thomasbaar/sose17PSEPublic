package com.example.android.fragments.data;

/**
 * Created by baar on 16.05.2017.
 */

public class Article {

    private String header;
    private String content;

    public Article(String header, String content){
        this.header = header;
        this.content = content;
    }

    public String getHeader(){
        return header;
    }

    public String getContent(){
        return content;
    }

}
