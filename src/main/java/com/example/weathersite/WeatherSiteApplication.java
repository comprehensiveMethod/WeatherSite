package com.example.weathersite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WeatherSiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherSiteApplication.class, args);
    }

}
