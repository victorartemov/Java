package com.ssu.victor_artemov.java.model;

public class Fragment {
    private Long id;
    private Long parentId;
    private String data;
    private Long authorId;
    private int likes;
    private boolean used;
    private String beginning;

    public Fragment(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getBeginning() {
        return beginning;
    }

    public void setBeginning(String beginning) {
        this.beginning = beginning;
    }

    public String toString() {
        return "Fragment[id=" + this.id + ", parent_id " + this.parentId + ", author_id " + this.authorId +
                ", likes " + this.likes + ", used " + this.used +"]" +
                "\n data = " + data +
                "\n beginning = " + beginning;
    }
}
