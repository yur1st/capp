package com.capp.tech.bootstrap;

import com.capp.tech.model.entity.AttributeLimitRange;
import com.capp.tech.services.AttributeLimitRangeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaDataLoader implements CommandLineRunner {


    private final AttributeLimitRangeService attributeLimitRangeService;

    public JpaDataLoader(AttributeLimitRangeService attributeLimitRangeService) {
        this.attributeLimitRangeService = attributeLimitRangeService;
    }

    @Override
    public void run(String... args) throws Exception {

        AttributeLimitRange range1 = new AttributeLimitRange();
        range1.setAttributeLimitRangeMin(0.75);
        range1.setAttributeLimitRangeMax(1.26);
        attributeLimitRangeService.save(range1);

        AttributeLimitRange range2 = new AttributeLimitRange();
        range2.setAttributeLimitRangeMin(2.75);
        range2.setAttributeLimitRangeMax(112.26);
        attributeLimitRangeService.save(range2);

        AttributeLimitRange range3 = new AttributeLimitRange();
        range3.setAttributeLimitRangeMin(0.34345);
        range3.setAttributeLimitRangeMax(75.26);
        attributeLimitRangeService.save(range3);

        System.out.println("Loaded Ranges for attributes....");

    }
}

