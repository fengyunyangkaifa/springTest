package com.usian.controller;

import com.usian.pojo.Teacher;
import com.usian.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@SuppressWarnings("ALL")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/findById/{id}")
    public List<Teacher> findAll(@PathVariable Integer id){
        return  teacherService.findAll(id);
    }
    @PostMapping("/insert")
    public String insert(@RequestBody Teacher teacher){
        teacherService.insert(teacher);
        return "ok";
    }


}
