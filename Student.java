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


public class Student {

    private String name;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Course> getEnrolledCourses() { return enrolledCourses; }

    public void enroll(Course course) {
        enrolledCourses.add(course);
    }

    public void displayCourses() {
        System.out.println(name + "'s courses:");
        if (enrolledCourses.isEmpty()) {
            System.out.println("  No courses enrolled.");
        } else {
            for (Course c : enrolledCourses) {
                System.out.println("  " + c);
            }
        }
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}
