package com.map1;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
    @Id
    private int pid;
    private String pname;

    @ManyToMany
    private List<Emp> emps;

    public Project() {
        super();
    }

    public Project(int pid, String pname, List<Emp> emps) {
        super();
        this.pid = pid;
        this.pname = pname;
        this.emps = emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
    public List<Emp> getEmps() {
        return emps;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPid() {
        return pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPname() {
        return pname;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
