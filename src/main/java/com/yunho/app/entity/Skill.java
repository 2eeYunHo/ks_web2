package com.yunho.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity

public class Skill {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer grade;

    public Skill() {
    }

    public Skill(String job, Integer grade) {
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Integer getGrade(){return grade;}

    public  void  setGrade(Integer grade) { this.grade = grade;}
}