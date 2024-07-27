package com.sparta.pt.springtutorial.repositories;

import com.sparta.pt.springtutorial.run.Location;
import com.sparta.pt.springtutorial.run.Run;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<Run>();

    List<Run> findAll() {
        return runs;
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Monday run",
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(30),
                3,
                Location.INDOOR));

        runs.add(new Run(1, "Monday run",
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(45),
                5,
                Location.INDOOR));
    }
}
