package com.lendapp.tutorial;

public class School {
    private String name;
    private String address;
    private String classrooms;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(String classrooms) {
        this.classrooms = classrooms;
    }
}
