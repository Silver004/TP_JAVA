package com.tnsoft.pfe.Students.controllers;

import com.tnsoft.pfe.Students.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private IStudentService service;
    /*public StudentController(IStudentService service){
        this.service = service;
    }*/
    @GetMapping("/{id}")
    public Double getMark(@PathVariable("id") Long idStudent){
        System.out.println("Service ==> [" + service + "]");
        System.out.println("Level controller id student ==> [" + idStudent + "]");
        return service.getStudentMark(idStudent);
    }
    public StudentController(){
        System.out.println("Creating Student controller instance ...");
    }

}
