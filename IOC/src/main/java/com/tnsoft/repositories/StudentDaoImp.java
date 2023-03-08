package com.tnsoft.repositories;

import com.tnsoft.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp implements IStudentDao{
    private List<Student> db = new ArrayList<>();
    public boolean create(Student x){
        System.out.println("DAO:Create:Student[" + x.toString() + "]");
        db.remove(0);
        db.add(x);
        System.out.println(db);
        return true;
    }

    public boolean update(Student x){
        System.out.println("DAO:Update:Student[" + x.toString() + "]");
        db.add(x);
        System.out.println(db);
        return true;
    }
    public boolean delete(Long id){
        System.out.println("DAO:Delete:Student");
        return true;
    }
    public List<Student> readAll(){
        System.out.println("DAO:readAll:Student");
        return  db;
    }
}
