package com.tnsoft.repositories;

import com.tnsoft.entities.StudentEntity;
import com.tnsoft.entities.StudentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository(value = "mainRepo")
public interface IStudentRepository extends JpaRepository<StudentEntity, StudentId> {
    //JpaRepository extends PagingAndSortingRepository which extends CrudRepository


}
