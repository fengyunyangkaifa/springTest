package com.usian.controller;

import com.usian.pojo.Student;
import com.usian.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/student")
@SuppressWarnings("ALL")
public class StudentController {

       @Autowired
       private StudentService studentService;

       @GetMapping("/findById/{id}")
       public List<Student> findAll(@PathVariable Integer id) {
           return studentService.findAll(id);
       }
}
