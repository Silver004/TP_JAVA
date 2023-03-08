package com.tnsoft.services;

import com.tnsoft.models.Student;

import java.util.List;

public interface IStudentService {
    boolean create(Student x);
    boolean update(Student x);
    boolean delete(Long id);
    List<Student> readAll();
}
