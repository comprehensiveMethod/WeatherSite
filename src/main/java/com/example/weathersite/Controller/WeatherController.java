package com.example.weathersite.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @GetMapping("/weather")
    public String weather(){
        return "weatherSite";
    }
}
