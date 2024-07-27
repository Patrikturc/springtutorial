package com.sparta.pt.springtutorial.controllers;

import com.sparta.pt.springtutorial.run.Run;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RunController {

    private List<Run> run = new ArrayList<Run>();

    @GetMapping("/hello")
    String home() {
        return "Hello Runner";
    }
}
