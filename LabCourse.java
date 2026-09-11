/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

/**
 *
 * @author WIN(10)X64
 */
public class LabCourse extends Course {
    //inheritance ==> extend
    //attribute
    private String labLocation;
  //constructor 
    public LabCourse(String name, String labLocation) {
        super(name);   //inhertance ==>super
        this.labLocation = labLocation;
    }
    //getter/setter

    public String getLabLocation() { return labLocation; }
    public void setLabLocation(String labLocation) { this.labLocation = labLocation; }

    @Override
    public String getType() {
        return "Lab";
    }

    @Override
    public String toString() {
        return super.toString() + " | Lab Location: " + labLocation;
    }
}

