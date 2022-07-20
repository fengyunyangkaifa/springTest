package com.usian.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "student")
public class Student {
@Id
@GeneratedValue(generator = "JDBC")
  private Integer id;
@Column(name = "name")
  private String sName;
  private Integer age;
  private String hobby;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date birthday;
  private Integer tid;
@Transient
private Teacher teacher;

  public String getsName() {
    return sName;
  }

  public void setsName(String sName) {
    this.sName = sName;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Integer getTid() {
    return tid;
  }

  public void setTid(Integer tid) {
    this.tid = tid;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public Student() {
  }

  public Student(Integer id, String sName, Integer age, String hobby, Date birthday, Integer tid) {
    this.id = id;
    this.sName = sName;
    this.age = age;
    this.hobby = hobby;
    this.birthday = birthday;
    this.tid = tid;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", sName='" + sName + '\'' +
            ", age=" + age +
            ", hobby='" + hobby + '\'' +
            ", birthday=" + birthday +
            ", tid=" + tid +
            '}';
  }
}
