package com.tnsoft.repositories;

import com.tnsoft.models.Student;

import java.util.List;

public interface IStudentDao {
    boolean create(Student x);
    boolean update(Student x);
    boolean delete(Long id);
    List<Student> readAll();
}
