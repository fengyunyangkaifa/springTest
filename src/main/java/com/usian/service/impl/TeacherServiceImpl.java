package com.usian.service.impl;


import com.usian.mapper.StudentMapper;
import com.usian.mapper.TeacherMapper;
import com.usian.pojo.Teacher;
import com.usian.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

@Autowired
private TeacherMapper teacherMapper;
@Autowired
private StudentMapper studentMapper;

    @Override
    public List<Teacher> findAll(Integer id) {
        return teacherMapper.findAll(id);
    }

    @Override
    public void insert(Teacher teacher) {
        teacherMapper.insertSelective(teacher);
        studentMapper.add(teacher.getStudentList(),teacher.getTid());
    }
}
