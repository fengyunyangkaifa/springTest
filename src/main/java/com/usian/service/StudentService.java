package com.usian.service;

import com.usian.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll(Integer id);
}
