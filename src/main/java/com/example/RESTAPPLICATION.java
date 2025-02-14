package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RESTAPPLICATION {
    public static void main(String[] args) {
        SpringApplication.run(RESTAPPLICATION.class, args);
    }
}

//@RestController
//class HelloController {
//    @GetMapping("/")
//    public String hello() {
//        return "Hello World";
//    }
//}

@RestController
@RequestMapping("/")//WE CAN WRITE MAY NUMBER OF "/" CONTROLLERS
class HelloController{
    @GetMapping("/HI")
    public String Hi(){
        return "Hi World";
    }

    @GetMapping("/HELLO")
    public String Hello(){
        return "HELLO";
    }
}
