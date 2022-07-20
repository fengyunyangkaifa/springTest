package com.usian.pojo;

import javax.persistence.*;
import java.util.List;

@Table(name = "teacher")
public class Teacher {
@Id
@GeneratedValue(generator = "JDBC")
@Column(name = "id")
  private Integer tid;
  private String name;
  private String type;
  private Integer age;
@Transient
private List<Student> studentList;

  public Integer getTid() {
    return tid;
  }

  public void setTid(Integer tid) {
    this.tid = tid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public List<Student> getStudentList() {
    return studentList;
  }

  public void setStudentList(List<Student> studentList) {
    this.studentList = studentList;
  }

  public Teacher() {
  }

  public Teacher(Integer tid, String name, String type, Integer age, List<Student> studentList) {
    this.tid = tid;
    this.name = name;
    this.type = type;
    this.age = age;
    this.studentList = studentList;
  }

  @Override
  public String toString() {
    return "Teacher{" +
            "tid=" + tid +
            ", name='" + name + '\'' +
            ", type='" + type + '\'' +
            ", age=" + age +
            ", studentList=" + studentList +
            '}';
  }
}
