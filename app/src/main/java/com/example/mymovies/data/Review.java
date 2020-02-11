package com.example.mymovies.data;

public class Review {

    private String autor;
    private String content;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Review(String autor, String content) {
        this.autor = autor;
        this.content = content;
    }
}
