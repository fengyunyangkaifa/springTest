package com.usian;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.usian.mapper.StudentMapper;
import com.usian.mapper.TeacherMapper;
import com.usian.pojo.Student;
import com.usian.pojo.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class TeacherTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test01(){
        Teacher teacher = new Teacher();
        teacher.setTid(1);
        teacherMapper.findAll(teacher.getTid());
    }
    @Test
    public void test02(){
        Teacher teacher = new Teacher();
        teacher.setName("啊哈哈哈哈");
        teacher.setAge(34);
        teacher.setType("大数据");
        List<Student> list = new ArrayList<>();
        Student student = new Student(null,"金钱豹",23,"吃",new Date(),1);
        Student student2 = new Student(null,"财神爷",23,"玩",new Date(),3);
        list.add(student);
        list.add(student2);
        teacher.setStudentList(list);
        teacherMapper.insert(teacher);
        studentMapper.add(list,teacher.getTid());
    }
    @Test
    public void findByIdTest() throws Exception {
        // 1. 请求类型 post
        // 2. 请求参数
        // 3. 接口返回值
//        Teacher users = new Teacher();
//        users.setName("哈哈哈哈");
        // http://127.0.0.1:9090/user/save
        MockHttpServletRequestBuilder get = MockMvcRequestBuilders.get("/teacher/findById/1");
        //把users对象转换成json对象 如果你的请求传递的是JSON类型 那么你需要设置contentType application/json
//        post.contentType(MediaType.APPLICATION_JSON_VALUE).content(objectMapper.writeValueAsBytes(users));
        //发送请求
        mockMvc.perform(get).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void insertTest() throws Exception {
        // 1. 请求类型 post
        // 2. 请求参数
        // 3. 接口返回值
        Teacher teacher = new Teacher();
        teacher.setName("啊哈哈哈哈");
        teacher.setAge(34);
        teacher.setType("大数据");
        List<Student> list = new ArrayList<>();
        Student student = new Student(null,"金钱豹",23,"吃",new Date(),1);
        Student student2 = new Student(null,"财神爷",23,"玩",new Date(),3);
        list.add(student);
        list.add(student2);
        teacher.setStudentList(list);
        // http://127.0.0.1:9090/user/save

        MockHttpServletRequestBuilder post = MockMvcRequestBuilders.post("/teacher/insert");
        //把users对象转换成json对象 如果你的请求传递的是JSON类型 那么你需要设置contentType application/json
        post.contentType(MediaType.APPLICATION_JSON_VALUE).content(objectMapper.writeValueAsBytes(teacher));
        //发送请求
        mockMvc.perform(post).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());
    }

}
