package com.capp.tech.guy;

import com.capp.tech.guy.map.Guy;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuyController {

    private final GuyService guyService;

    public GuyController(GuyService guyService) {
        this.guyService = guyService;
    }

    @GetMapping(value = "api/guy", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Guy> listAll() {

        return guyService.findAll();
    }

    @GetMapping(value = "api/guy/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Guy listById(@PathVariable Long id) {

        return guyService.findById(id);
    }

}
