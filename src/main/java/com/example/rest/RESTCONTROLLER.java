package com.example.rest;

import com.example.entity.Student;
import com.example.entity.StudentRespaonse;
import com.example.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        if((studentid >= students.size()) || (studentid < 0)){
            throw new StudentNotFoundException("student id not found " + studentid);
        }
        return students.get(studentid);// // JACKSON - CONVERT TO JSON OBJECT
    }

    @ExceptionHandler
    public ResponseEntity<StudentRespaonse> handleException(StudentNotFoundException e){
        StudentRespaonse error = new StudentRespaonse(); // object
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(e.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<StudentRespaonse>(error, HttpStatus.NOT_FOUND);

    }
}
