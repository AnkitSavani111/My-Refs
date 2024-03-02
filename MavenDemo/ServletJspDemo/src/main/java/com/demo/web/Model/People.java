package com.demo.web.Model;

public class People {
    private int pid;
    private String pname;
    private String ptech;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPtech() {
        return ptech;
    }

    public void setPtech(String ptech) {
        this.ptech = ptech;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "People{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", ptech='" + ptech + '\'' +
                '}';
    }
}