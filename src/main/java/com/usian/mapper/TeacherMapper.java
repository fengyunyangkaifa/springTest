package com.usian.mapper;


import com.usian.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface TeacherMapper extends tk.mybatis.mapper.common.Mapper<Teacher> {
   List<Teacher> findAll(@Param("id") Integer id);
}
