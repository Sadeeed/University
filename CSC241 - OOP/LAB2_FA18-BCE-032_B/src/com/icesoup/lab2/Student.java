package com.icesoup.lab2;

public class Student {
    private String name;
    private String id;
    private float cgpa;



    public float calCgpa(float og ,float ng)
    {
        this.cgpa = (og + ng) / 2;
        return cgpa;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public String getName()
    {
        return name;
    }

    public void setId(String i)
    {
        this.id = i;
    }

    public String getId()
    {
        return id;
    }



}
