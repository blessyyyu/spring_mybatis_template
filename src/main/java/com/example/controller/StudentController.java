package com.example.controller;

import com.example.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;
    @GetMapping("/student/all")
    public String allStudent() {
        int count = studentMapper.countAll();
        return String.valueOf(count);
    }

    @GetMapping("/hellobugg")
    public String hellobugg() {
        return "hello buggggggg.";
    }
}
