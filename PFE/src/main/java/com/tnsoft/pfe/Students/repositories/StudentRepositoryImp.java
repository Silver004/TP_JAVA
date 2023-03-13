package com.tnsoft.pfe.Students.repositories;

import com.tnsoft.pfe.Students.services.StudentServiceImp;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class StudentRepositoryImp implements IStudentRepository{

    @Override
    public Double getMark(Long idStudent) {
        System.out.println("Level repository id student ==> [" + idStudent + "]");
        return 16.5;
    }
    public StudentRepositoryImp() {
        System.out.println("Creating Student repository instance ...");
    }
}
