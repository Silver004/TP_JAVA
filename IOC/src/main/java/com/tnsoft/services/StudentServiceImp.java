package com.tnsoft.services;

import com.tnsoft.models.Student;
import com.tnsoft.repositories.IStudentDao;
import com.tnsoft.repositories.StudentDaoImp;

import java.util.List;

public class StudentServiceImp implements IStudentService{
    private IStudentDao dao = new StudentDaoImp();
    public boolean create(Student x){
        System.out.println("Using service layer");
        return dao.create(x);
    }
    public boolean update(Student x){
        System.out.println("Using service layer");
        return update(x);
    }
    public boolean delete(Long id){
        System.out.println("Using service layer");
        return dao.delete(id);
    }

    public List<Student> readAll() {
        System.out.println("Using service layer");
        return dao.readAll();
    }
}
