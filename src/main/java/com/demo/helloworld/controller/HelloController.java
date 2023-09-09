package com.demo.helloworld.controller;

import com.demo.helloworld.entity.Demo;
import com.demo.helloworld.repo.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HelloController {


    @Autowired
    DemoRepo demoRepo;

    @GetMapping
    public String hello(){
        return "Hello World from spring boot";
    }


    @PostMapping("/add")
    public ResponseEntity<Demo> add(@RequestBody Demo demo){
        Demo result = demoRepo.save(demo);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Demo>> getAll(){
        List<Demo> demoList = demoRepo.findAll();
        return new ResponseEntity<>(demoList, HttpStatus.OK);
    }
}
