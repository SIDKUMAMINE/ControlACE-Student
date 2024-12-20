package com.example.ControlACE.dto;

import com.example.ControlACE.dao.Student;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();

    public  Student toStudent(StudentDto studentDTO) {
        return mapper.map(studentDTO, Student.class);
    }

    public  StudentDto toStudentDTO(Student student) {
        return mapper.map(student, StudentDto.class);
    }
}
