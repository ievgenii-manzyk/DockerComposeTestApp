package com.manzyk.app;

import com.manzyk.app.domain.Student;
import com.manzyk.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Date;

@SpringBootApplication
public class SpringBootPostgresExample {

    @Autowired
    StudentService studentService;

    public static void main(String [] argv){
        SpringApplication.run(SpringBootPostgresExample.class, argv);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        System.out.println("hello world, lets add some student:");
        Student stud = new Student();
        stud.setDateOfBirth(new Date());
        stud.setName("John");
        Student studFromDb = studentService.addStudent(stud);
        System.out.println("Now we select student from DB:");
        System.out.println("Student from DB:" + studentService.getStudent(studFromDb.getRollNo()).toString());
    }
}
