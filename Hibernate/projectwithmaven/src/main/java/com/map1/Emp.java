package com.map1;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Emp {
    @Id
    private int eid;
    private String name;
    
    @ManyToMany
    private List<Project> projects;

    public Emp() {
        super();
    }

    public Emp(int eid, String name, List<Project> projects) {
        super();
        this.eid = eid;
        this.name = name;
        this.projects = projects;
    }

    // Getters and Setters
    // toString

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getEid() {
        return eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Project> getProjects() {
        return projects;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}