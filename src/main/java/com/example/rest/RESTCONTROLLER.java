package com.example.rest;

import com.example.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTCONTROLLER {

    @GetMapping("/students")
    public List<Student> getstudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("sasank","reddy"));
        students.add(new Student("lohith","reddy"));
        students.add(new Student("avinash","reddy"));
        return students;
    }
}
