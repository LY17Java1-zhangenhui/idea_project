package com.qhit.pojo;

/**
 * @author 2304802030@qq.com
 * @create 2019-03-16-11:55
 */
public class User {
    private int id;
    private String name;
    private String passWord;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nme='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public User() {
    }

    public User(int id, String name, String passWord) {
        this.id = id;
        this.name = name;
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
