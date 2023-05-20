package com.example.mctfinal.controller;

import com.example.mctfinal.model.Student;
import com.example.mctfinal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/get")
    public Iterable<Student> getall(){
       return studentService.getall();
    }
    @PostMapping("/post")
    public void postall(@RequestBody Student student){
        studentService.save(student);

    }
}
