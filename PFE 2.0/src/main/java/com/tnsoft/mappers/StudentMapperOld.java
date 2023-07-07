package com.tnsoft.mappers;

import com.tnsoft.entities.StudentEntity;
import com.tnsoft.entities.StudentId;
import com.tnsoft.models.StudentDto;
import com.tnsoft.models.StudentIdDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Component annotation will allow us to create an object on application start that will be in the application context,
// By default it will allow us to create one object similar to singleton's behavior

@Component(value = "mainMapper")
public class StudentMapperOld {
    public StudentIdDto convertStudentIdEntityToIdDto(StudentId id){
        return new StudentIdDto(id.getId(), id.getCode());
    }
    public StudentId convertStudentIdDtoToIdEntity(StudentIdDto id){
        return new StudentId(id.getId(), id.getCode());
    }
    public StudentEntity convertDtoToEntity(StudentDto x){
        StudentEntity entity = new StudentEntity();
        entity.setName(x.getName());
        entity.setId(new StudentId(x.getId().getId(), x.getId().getCode()));
        return entity;
    }

    public StudentDto convertEntityToDto(StudentEntity x){
        StudentDto dto = new StudentDto();
        dto.setName(x.getName());
        dto.setId(new StudentIdDto(x.getId().getId(), x.getId().getCode()));
        return dto;
    }

    public List<StudentEntity> convertListDtoToListEntities(List<StudentDto> dtoList){
        /*
        List<StudentEntity> entitiesList = new ArrayList<>();
        for(StudentDto x : dtoList){
            entitiesList.add(convertDtoToEntity(x));
        }
        return entitiesList;
        */
         return dtoList.stream().map(dto->convertDtoToEntity(dto)).collect(Collectors.toList());
    }
    public List<StudentDto> convertListEntitiesToDtoList(List<StudentEntity> entitiesList){
        /*
        List<StudentDto> dtoList = new ArrayList<>();
        for(StudentEntity x : entitiesList){
            dtoList.add(convertEntityToDto(x));
        }
        return dtoList;
         */
        if(entitiesList != null && !entitiesList.isEmpty()){
            return entitiesList.stream().map(entity->convertEntityToDto(entity)).collect(Collectors.toList());
        } else return new ArrayList<>();

    }

}
