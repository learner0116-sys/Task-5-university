/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.university;

/**
 *
 * @author WIN(10)X64
 */
public class University {

    public static void main(String[] args) {
           //create object / instance 
        Department csDept = new Department("Computer Science");

        TheoryCourse algorithms = new TheoryCourse("Algorithms", 20);
        LabCourse programmingLab = new LabCourse("Programming Lab", "Building A - Room 101");
       //calling methods from another class
        csDept.addCourse(algorithms);
        csDept.addCourse(programmingLab);

        Student student1 = new Student("Ahmed");
        Student student2 = new Student("Sara");
//calling methods from another class
        csDept.addStudent(student1);
        csDept.addStudent(student2);

        student1.enroll(algorithms);
        student2.enroll(programmingLab);
        student2.enroll(algorithms);

        csDept.displayAllCourses();

        System.out.println();
        student1.displayCourses();
        System.out.println();
        student2.displayCourses();
    }

}
