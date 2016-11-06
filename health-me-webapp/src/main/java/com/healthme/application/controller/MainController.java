package com.healthme.application.controller;

import org.springframework.web.bind.annotation.RestController;

import com.healthme.application.entity.Patient;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MainController {
    
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String homepage(){
        return "index";
    }

//    @RequestMapping("/greeting")
//    public String LoginController(@RequestParam(value="name", defaultValue="World") String name) {
//            return "hello";
//    }
    
    @RequestMapping("/greeting")
    public Patient LoginController(@RequestParam(value="name", defaultValue="World") String name) {
        return new Patient(counter.incrementAndGet(),String.format(template, name));
    }

}
