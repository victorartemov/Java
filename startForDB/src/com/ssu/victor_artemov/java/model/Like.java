package com.ssu.victor_artemov.java.model;

public class Like {
    private Long id;
    private Long authorId;

    public Like() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String toString(){
        return "Like[id = " + this.id + " author_id = " + this.authorId + "]";
    }
}
