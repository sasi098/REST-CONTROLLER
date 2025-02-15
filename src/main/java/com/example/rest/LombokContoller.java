package com.example.rest;

import com.example.LOMBOK.Lmabok;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lombok")
public class LombokContoller {
    @GetMapping("/data")
    public String getdata(){
        Lmabok lam = new Lmabok("sasi",19);
        return lam.getName() + " " + lam.getAge();
    }
}
