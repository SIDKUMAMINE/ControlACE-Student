package com.example.ControlACE.service;

import com.example.ControlACE.dto.StudentDto;

import java.util.Date;
import java.util.List;

public interface StudentService {
    List<StudentDto> getStudentsByDateNaissance(Date dateNaissance);
    StudentDto saveStudent(StudentDto studentDTO);
}
