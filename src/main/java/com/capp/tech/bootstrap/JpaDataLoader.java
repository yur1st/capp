package com.capp.tech.bootstrap;

import com.capp.tech.model.entity.AttributeLimitRange;
import com.capp.tech.repository.datajpa.AttributeLimitRangeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaDataLoader implements CommandLineRunner {


    private final AttributeLimitRangeRepository repository;

    public JpaDataLoader(AttributeLimitRangeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        AttributeLimitRange range1 = new AttributeLimitRange();
        range1.setAttributeLimitRangeMin(0.75);
        range1.setAttributeLimitRangeMax(1.26);
        repository.save(range1);

        AttributeLimitRange range2 = new AttributeLimitRange();
        range2.setAttributeLimitRangeMin(2.75);
        range2.setAttributeLimitRangeMax(112.26);
        repository.save(range2);

        AttributeLimitRange range3 = new AttributeLimitRange();
        range3.setAttributeLimitRangeMin(0.34345);
        range3.setAttributeLimitRangeMax(75.26);
        repository.save(range3);

        System.out.println("Loaded Ranges for attributes....");

    }
}
