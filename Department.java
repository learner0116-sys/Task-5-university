/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author WIN(10)X64
 */


public class Department {

    private String name;
    private List<Course> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Course> getCourses() { return courses; }
    public List<Student> getStudents() { return students; }

    public void displayAllCourses() {
        System.out.println("\n===== Courses in \"" + name + "\" Department =====");
        for (Course c : courses) {
            System.out.println(c);
        }
    }
}

