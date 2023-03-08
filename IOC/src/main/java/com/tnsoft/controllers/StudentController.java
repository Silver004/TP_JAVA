package com.tnsoft.controllers;

import com.tnsoft.models.Student;
import com.tnsoft.services.IStudentService;
import com.tnsoft.services.StudentServiceImp;

import java.util.List;

public class StudentController {
    private IStudentService service = new StudentServiceImp();
    public boolean create(Student x){
        return service.create(x);
    }
    public boolean update(Student x){
        return service.update(x);
    }
    public boolean delete(Long id){
        return service.delete(id);
    }

    public List<Student> readAll(){
        return service.readAll();
    }
}
