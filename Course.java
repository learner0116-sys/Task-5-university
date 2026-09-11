/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

/**
 *
 * @author WIN(10)X64
 */

public abstract class Course {
 //abstract class /parent class
    private String name;
//constructor
    public Course(String name) {
        this.name = name;
    }
 //getters
    public String getName() { return name; }
    public abstract String getType();
    //setter
    public void setName(String name) { this.name = name; }
    @Override
    public String toString() {
        return "Course: " + name + " | Type: " + getType();
    }
}

