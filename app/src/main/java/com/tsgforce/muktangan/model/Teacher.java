package com.tsgforce.muktangan.model;

import java.util.List;

public class Teacher extends User{

    private List<Student> students;
    private List<Grade> grades;

    public Teacher() {
    }

    public Teacher(String name, String phone, String profile_image, String user_id, List<Student> students, List<Grade> grades) {
        super(name, phone, profile_image, user_id);
        this.students = students;
        this.grades = grades;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "students=" + students +
                ", grades=" + grades +
                '}';
    }
}
