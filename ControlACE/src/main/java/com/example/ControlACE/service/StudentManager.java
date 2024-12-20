package com.example.ControlACE.service;

import com.example.ControlACE.dao.Student;
import com.example.ControlACE.dao.Studentrepository;
import com.example.ControlACE.dto.StudentDto;
import com.example.ControlACE.dto.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class StudentManager implements StudentService {
    @Autowired
    private Studentrepository  studentRepository;
    @Autowired
    private  StudentMapper studentMapper;

    @Override
    public List<StudentDto> getStudentsByDateNaissance(Date dateNaissance) {
        List<Student> students = studentRepository.findByDateNaissance(dateNaissance);
        List<StudentDto> studentDTOS = new ArrayList<>();
        for (Student student : students) {
            studentDTOS.add(studentMapper.toStudentDTO(student));
        }
        return studentDTOS;
    }
    @Override
    public StudentDto saveStudent(StudentDto studentDTO) {
        return studentMapper.toStudentDTO(studentRepository.save(studentMapper.toStudent(studentDTO)));

    }





}
