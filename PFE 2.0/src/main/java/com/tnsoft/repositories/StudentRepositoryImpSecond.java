package com.tnsoft.repositories;

import com.tnsoft.entities.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
//demo purposes
@Repository(value = "backupRepo")
public class StudentRepositoryImpSecond/* implements IStudentRepository*/{/*
    @Override
    public StudentEntity save(StudentEntity x) {
        return null;
    }

    @Override
    public StudentEntity update(StudentEntity x) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public List<StudentEntity> selectAll() {
        return null;
    }*/
}
