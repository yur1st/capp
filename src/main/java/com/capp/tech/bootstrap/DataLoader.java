package com.capp.tech.bootstrap;

import com.capp.tech.model.entity.Guy;
import com.capp.tech.services.GuyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final GuyService guyService;

    public DataLoader(GuyService guyService) {
        this.guyService = guyService;
    }

    @Override
    public void run(String... args) throws Exception {

        Guy guy1 = new Guy();
        guy1.setName("Vasily");
        guy1.setLastName("Utkin");
        guyService.save(guy1);

        Guy guy2 = new Guy();
        guy2.setName("Akakiy");
        guy2.setLastName("Huevo");
        guyService.save(guy2);

        Guy guy3 = new Guy();
        guy3.setName("Sebastian");
        guy3.setLastName("Fedorov");
        guyService.save(guy3);

        System.out.println("Loaded Guys....");

    }
}
