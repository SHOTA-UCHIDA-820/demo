package com.example.service;

import com.example.model.Student;
import com.example.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class SchoolService {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public void addStudent(Student student) {
        if (student.getAge() > 6) {
            students.add(student);
        } else {
            System.out.println(student.getName() + "さんは6歳以下です");
        }
    }

    public void addTeacher(Teacher teacher) {
        if (teacher.getAge() >22) {
            teachers.add(teacher);
        } else {
            System.out.println(teacher.getName() + "さんは22歳以下です");
        }
    }

    public void displayAll() {
        for (Student s : students) {
            System.out.println(s.getName() + ", " + s.getAge() + "歳, " + s.getClassName() + ", 生徒");
        }
        for (Teacher t : teachers) {
            System.out.println(t.getName() + ", " + t.getAge() + "歳, " + t.getSubject() + ", 先生");
        }
    }
}