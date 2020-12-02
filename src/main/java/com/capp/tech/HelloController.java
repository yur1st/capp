package com.capp.tech;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Guy;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }

    @GetMapping(value = "api/map", produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloMap() {
        List<Guy> guys = new ArrayList<>();
        Guy guy1 = new Guy("Vasily", "Utkin");
        Guy guy2 = new Guy("Akakiy", "Huevo");
        Guy guy3 = new Guy("Sebastian", "Fedorov");

        guys.add(guy1);
        guys.add(guy2);
        guys.add(guy3);

        String json = null;
        try {
            json = new ObjectMapper().writeValueAsString(guys);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
