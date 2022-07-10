package com.example.weathersite.Controller;

import com.example.weathersite.Model.WeatherForTown;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/weather")
    public String weather(Model model){
        WeatherForTown weather = new WeatherForTown();
        model.addAttribute("weather",weather);
        return "weatherPage";
    }
}
