package com.example.mctfinal.service;

import com.example.mctfinal.model.Student;
import com.example.mctfinal.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public Iterable<Student> getall() {
        return studentRepo.findAll();
    }

    public void save(Student student) {
        studentRepo.save(student);
    }
}
