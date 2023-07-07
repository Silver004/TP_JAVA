package com.tnsoft.repositories;

import com.tnsoft.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
//the main tag is a qualifier that is used to separate between the 2 classes that implements the interface during the injection
//this class is for demo purposes only for repository we use spring data
@Repository(value = "demoRepo")
public class StudentRepositoryImp /*implements IStudentRepository*/{/*
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentRepositoryImp.class);
    @Override
    public StudentEntity save(StudentEntity x) {
        LOGGER.debug("Start saving new student entity ==> Repository lvl");
        return x;
    }

    @Override
    public StudentEntity update(StudentEntity x) {
        LOGGER.debug("Start updating student entity ==> Repository lvl");
        return x;
    }

    @Override
    public Boolean delete(Long id) {
        LOGGER.debug("Start deleting student entity ==> Repository lvl");
        return null;
    }

    @Override
    public List<StudentEntity> selectAll() {
        LOGGER.debug("Start retrieving all student entities ==> Repository lvl");
        return null;
    }*/
}
