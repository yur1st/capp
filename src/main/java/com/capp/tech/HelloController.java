package com.capp.tech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }

    @GetMapping("api/map")
    public Map<Long, String> helloMap() {
        Map<Long, String > map = new HashMap<>();
        map.put(1L,"Hello guys");
        map.put(3L, "Bye, guys");
        return map;
    }
}
