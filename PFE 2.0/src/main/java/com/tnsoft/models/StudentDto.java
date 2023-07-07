package com.tnsoft.models;

import java.util.List;

// This class is meant to host the Student object coming from the view DTO stands for data transfer object
public class StudentDto {
    private String name;
    private StudentIdDto id;
    private AddressDto address;

    private List<CourseDto> courses;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentIdDto getId() {
        return id;
    }

    public void setId(StudentIdDto id) {
        this.id = id;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDto> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
