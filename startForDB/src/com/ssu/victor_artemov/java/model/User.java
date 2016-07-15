package com.ssu.victor_artemov.java.model;

public class User {
    private Long id;
    private String firstName;
    private String secondName;
    private String middleName;
    private String password;
    private String userName;

    public User(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String toString(){
        return "User[id = " + this.id + " first_name = " + this.firstName + " second_name = " + this.secondName
                + " middle_name = " + this.middleName + " password = " + this.password +
                " username = " + this.userName + "]";
    }
}
