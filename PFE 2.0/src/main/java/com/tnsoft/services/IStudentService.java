package com.tnsoft.services;

import com.tnsoft.models.StudentDto;
import com.tnsoft.models.StudentIdDto;

import java.util.List;

public interface IStudentService {
    StudentDto save(StudentDto x);
    StudentDto update(StudentDto x);
    Boolean delete(StudentIdDto id);
    List<StudentDto> selectAll();

}
