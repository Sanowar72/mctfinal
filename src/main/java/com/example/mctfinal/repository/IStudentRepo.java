package com.example.mctfinal.repository;

import com.example.mctfinal.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Long> {

}
