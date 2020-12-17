package com.capp.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private ApplicationContext appContext;

    @GetMapping(value = "/endpoints")
    public List<String> endpoints() {
        RequestMappingHandlerMapping requestHandlerMapping = appContext.getBean(RequestMappingHandlerMapping.class);
        return requestHandlerMapping.getHandlerMethods()
                .entrySet()
                .stream()
                .map(entry -> String.format("%-50s %-10s: %s",
                        entry.getKey().getPatternsCondition().getPatterns(),
                        entry.getKey().getMethodsCondition(),
                        entry.getValue()))
                .sorted()
                .collect(Collectors.toList());
    }
}
