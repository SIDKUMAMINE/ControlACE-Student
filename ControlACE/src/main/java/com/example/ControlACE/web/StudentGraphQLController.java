package com.example.ControlACE.web;

import com.example.ControlACE.dto.StudentDto;
import com.example.ControlACE.dao.Student;
import com.example.ControlACE.dto.StudentDto;
import com.example.ControlACE.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
public class StudentGraphQLController {
    @Autowired
    private  StudentService studentService;


    @QueryMapping
    public List<StudentDto> getStudentsByDateNaissance(@Argument Date dateNaissance) {
        return studentService.getStudentsByDateNaissance(dateNaissance);
    }

    @MutationMapping
    public StudentDto saveStudent(@Argument  StudentDto studentDto) {
        return studentService.saveStudent(studentDto);
    }
}
