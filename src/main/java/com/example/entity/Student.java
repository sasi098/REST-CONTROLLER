package com.example.entity;

public class Student {
    private String fname;
    private String lname;

    public Student(String fname,String lname){
        this.fname = fname;
        this.lname = lname;
    }

    public String getfname(){
        return fname;
    }

    public void setfname(String fname) {
        this.fname = fname;
    }

    public String getlname(){
        return lname;
    }

    public void setlname(String lname) {
        this.lname = lname;
    }
}
