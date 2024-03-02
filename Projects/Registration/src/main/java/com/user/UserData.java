package com.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserData
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String uname;
    private String umail;
    private String upwd;
    private String umobile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUmail() {
        return umail;
    }

    public void setUmail(String umail) {
        this.umail = umail;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUmobile() {
        return umobile;
    }

    public void setUmobile(String umobile) {
        this.umobile = umobile;
    }

    public UserData(String uname, String umail, String upwd, String umobile) {
        super();
        this.uname = uname;
        this.umail = umail;
        this.upwd = upwd;
        this.umobile = umobile;
    }

    public UserData() {
        super();
    }
}
