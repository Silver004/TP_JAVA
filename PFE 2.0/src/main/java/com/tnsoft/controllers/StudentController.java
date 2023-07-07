package com.tnsoft.controllers;

import com.tnsoft.models.StudentDto;
import com.tnsoft.models.StudentIdDto;
import com.tnsoft.services.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    private IStudentService service;
    //Injection using the constructor
    StudentController(@Qualifier("mainService") IStudentService service){
        this.service = service;
    }
    @PostMapping
    public StudentDto save(@RequestBody StudentDto x){
        LOGGER.debug("Start saving new student entity ==> Controller lvl the dto is [{}]",x);
        return service.save(x);
    }
    @PutMapping
    public StudentDto update(@RequestBody StudentDto x){
        LOGGER.debug("Start updating student entity ==> Controller lvl the dto is [{}]",x);
        return service.update(x);
    }
    @DeleteMapping("/{ids}/{code}")
    public Boolean delete(@PathVariable("ids") Long id, @PathVariable("code") String code){
        LOGGER.debug("Start deleting student entity ==> Controller lvl the given id is [{}]", id);
        StudentIdDto idToDelete = new StudentIdDto(id, code);
        return service.delete(idToDelete);
    }
    @GetMapping
    public List<StudentDto> selectAll(){
        LOGGER.debug("Start retrieving all student entities ==> Controller lvl");
        return service.selectAll();
    }
}
