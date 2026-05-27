package com.stamped.stamped_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class HealthController {
    
    @GetMapping("/health")
    public Map<String,String> health() {
        return Map.of("Status","UP");
    }
    
}
