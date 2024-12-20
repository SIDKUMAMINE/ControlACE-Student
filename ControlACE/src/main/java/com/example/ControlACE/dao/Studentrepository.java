package com.example.ControlACE.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface Studentrepository extends JpaRepository<Student,Long> {
    List<Student> findByDateNaissance(Date dateNaissance);
}
