package com.example.rest;

import com.example.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTCONTROLLER {
    List<Student> students;
    @GetMapping("/students")
    public List<Student> getstudents(){
        students = new ArrayList<>();
        students.add(new Student("sasank","reddy"));
        students.add(new Student("lohith","reddy"));
        students.add(new Student("avinash","reddy"));
        return students; // JACKSON - CONVERT TO JSON ARRAY
    }

    @GetMapping("/students/{studentid}")
    public Student getsingle(@PathVariable int studentid){
        return students.get(studentid);// // JACKSON - CONVERT TO JSON OBJECT
    }
}
