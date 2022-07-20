package com.usian;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.usian.mapper.StudentMapper;
import com.usian.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class StudentTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    private StudentMapper studentMapper;


    @Test
    public void test1(){
        Student student = new Student();
        student.setId(1);
        studentMapper.findAll(student.getId());
    }
    @Test
    public void controllerTest() throws Exception {
        // 1. 请求类型 post
        // 2. 请求参数
        // 3. 接口返回值
//        Student users = new Student();
//        users.setName("张三");
        // http://127.0.0.1:9090/user/save
        MockHttpServletRequestBuilder get = MockMvcRequestBuilders.get("/student/findById/2");
        //把users对象转换成json对象 如果你的请求传递的是JSON类型 那么你需要设置contentType application/json
//        post.contentType(MediaType.APPLICATION_JSON_VALUE).content(objectMapper.writeValueAsBytes(users));
        //发送请求
        mockMvc.perform(get).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());
    }

}
