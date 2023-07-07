package com.tnsoft.services;

import com.tnsoft.mappers.StudentMapper;
import com.tnsoft.mappers.StudentMapperOld;
import com.tnsoft.models.StudentDto;
import com.tnsoft.models.StudentIdDto;
import com.tnsoft.repositories.IStudentRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "mainService")
public class StudentServiceImp implements IStudentService{
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImp.class);
    private IStudentRepository repository;

    private StudentMapper mapper = Mappers.getMapper(StudentMapper.class);

    StudentServiceImp(@Qualifier("mainRepo") IStudentRepository studentRepository){
        this.repository = studentRepository;
    }

    @Override
    public StudentDto save(StudentDto x) {
        LOGGER.debug("Start saving new student entity ==> Service lvl");
        LOGGER.debug("The values within student dto is ==>[" + x.toString() + "]");
        return mapper.convertEntityToDto(repository.save(mapper.convertDtoToEntity(x)));
    }

    @Override
    public StudentDto update(StudentDto x) {
        LOGGER.debug("Start updating student entity ==> Service lvl");
        LOGGER.debug("The values within student dto is ==>[" + x.toString() + "]");
        return mapper.convertEntityToDto(repository.save(mapper.convertDtoToEntity(x)));
    }

    @Override
    public Boolean delete(StudentIdDto id) {
        LOGGER.debug("Start deleting student entity ==> Service lvl");
        LOGGER.debug("The student id given is is ==>[" + id + "]");
        repository.deleteById(mapper.convertStudentIdDtoToIdEntity(id));
        return true;
    }

    @Override
    public List<StudentDto> selectAll() {
        LOGGER.debug("Start retrieving all student entities ==> Service lvl");
        return mapper.convertListEntitiesToDtoList(repository.findAll());
    }
}
