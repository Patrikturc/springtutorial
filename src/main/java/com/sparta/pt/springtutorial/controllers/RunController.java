package com.sparta.pt.springtutorial.controllers;

import com.sparta.pt.springtutorial.repositories.RunRepository;
import com.sparta.pt.springtutorial.run.Run;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RunController {

    private final RunRepository runRepository;

    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    List<Run> findAll(){
        return new ArrayList<>();
    }
}
