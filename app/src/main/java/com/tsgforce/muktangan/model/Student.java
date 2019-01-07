package com.tsgforce.muktangan.model;

import java.util.List;

public class Student extends User{

    private Grade grade;
    private List<Subject> subjects;

    public Student() {
    }

    public Student(String name, String phone, String profile_image, String user_id, Grade grade, List<Subject> subjects) {
        super(name, phone, profile_image, user_id);
        this.grade = grade;
        this.subjects = subjects;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", subjects=" + subjects +
                '}';
    }
}
