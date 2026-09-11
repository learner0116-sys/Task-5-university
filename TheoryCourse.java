/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

/**
 *
 * @author WIN(10)X64
 */
public class TheoryCourse extends Course {

    private int numberOfLectures;

    public TheoryCourse(String name, int numberOfLectures) {
        super(name);
        this.numberOfLectures = numberOfLectures;
    }

    public int getNumberOfLectures() { return numberOfLectures; }
    public void setNumberOfLectures(int numberOfLectures) { this.numberOfLectures = numberOfLectures; }

    @Override
    public String getType() {
        return "Theory";
    }

    @Override
    public String toString() {
        return super.toString() + " | Lectures: " + numberOfLectures;
    }
}

