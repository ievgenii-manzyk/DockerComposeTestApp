package com.manzyk.app.service;

import com.manzyk.app.repository.StudentRepository;
import com.manzyk.app.domain.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public Iterable<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Student getStudent(Integer studentId){
      return studentRepository.findById(studentId).get();
  }
}
