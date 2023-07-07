package com.tnsoft.mappers;

import com.tnsoft.entities.CourseEntity;
import com.tnsoft.entities.StudentEntity;
import com.tnsoft.entities.StudentId;
import com.tnsoft.models.CourseDto;
import com.tnsoft.models.StudentDto;
import com.tnsoft.models.StudentIdDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    public StudentIdDto convertStudentIdEntityToIdDto(StudentId id);
    public StudentId convertStudentIdDtoToIdEntity(StudentIdDto id);
    public StudentEntity convertDtoToEntity(StudentDto x);
    public StudentDto convertEntityToDto(StudentEntity x);
    public List<StudentEntity> convertListDtoToListEntities(List<StudentDto> dtoList);
    public List<StudentDto> convertListEntitiesToDtoList(List<StudentEntity> entitiesList);

}
