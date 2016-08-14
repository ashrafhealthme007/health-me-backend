package com.healthme.application.login.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.healthme.application.login.entity.Patient;

@RestController
public class LoginController {
        private static final String template = "Hello, %s!";
        private final AtomicLong counter = new AtomicLong();

        @RequestMapping("/greeting")
        public Patient LoginController(@RequestParam(value="name", defaultValue="World") String name) {
            return new Patient(counter.incrementAndGet(),
                                String.format(template, name));
        }
}
