package com.example;

import com.example.model.Student;
import com.example.model.Teacher;
import com.example.service.SchoolService;

public class Main {
    public static void main(String[] args) {
        SchoolService schoolService = new SchoolService();

        Student s1 = new Student("太郎", 15, "1組");
        Student s2 = new Student("次郎", 4, "2組");
        Teacher t1 = new Teacher("佐藤", 30, "算数");
        Teacher t2 = new Teacher("田中", 58, "歴史");

        schoolService.addStudent(s1);
        schoolService.addStudent(s2);
        schoolService.addTeacher(t1);
        schoolService.addTeacher(t2);

        schoolService.displayAll();
    }
}