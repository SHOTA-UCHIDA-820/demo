package com.example.model;

public class Student extends Person {
    private String className;

    public Student(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}