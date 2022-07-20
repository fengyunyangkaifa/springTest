package com.usian.service.impl;

import com.usian.mapper.StudentMapper;
import com.usian.pojo.Student;
import com.usian.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll(Integer id) {
        return studentMapper.findAll(id);
    }
}
