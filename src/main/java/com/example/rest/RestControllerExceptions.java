package com.example.rest;

import com.example.entity.StudentRespaonse;
import com.example.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestControllerExceptions {
    @ExceptionHandler
    public ResponseEntity<StudentRespaonse> handleException(StudentNotFoundException e){
        StudentRespaonse error = new StudentRespaonse(); // object
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(e.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<StudentRespaonse>(error, HttpStatus.NOT_FOUND);

    }
}
