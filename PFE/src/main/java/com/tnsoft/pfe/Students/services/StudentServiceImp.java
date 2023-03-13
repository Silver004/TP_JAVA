package com.tnsoft.pfe.Students.services;

import com.tnsoft.pfe.Students.repositories.IStudentRepository;
import com.tnsoft.pfe.Students.repositories.StudentRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements IStudentService{

    @Autowired
    private IStudentRepository repository;
    /*
    public StudentServiceImp(IStudentRepository repository){
        this.repository = repository;
    }*/
    @Override
    public Double getStudentMark(Long idStudent) {
        System.out.println("Repository ==> [" + repository + "]");
        System.out.println("Level service id student ==> [" + idStudent + "]");
        return repository.getMark(idStudent);
    }

    public StudentServiceImp(){
        System.out.println("Creating Student service instance ...");
    }
}
