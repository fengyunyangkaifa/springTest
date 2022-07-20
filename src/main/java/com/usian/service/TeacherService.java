package com.usian.service;

import com.usian.pojo.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherService {

    List<Teacher> findAll(Integer id);

    void insert(Teacher teacher);
}
