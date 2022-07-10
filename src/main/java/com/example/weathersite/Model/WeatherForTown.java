package com.example.weathersite.Model;

import lombok.Getter;
import lombok.Setter;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class WeatherForTown {

     JSONObject jsonObject;
     {
          try {
               jsonObject = WeatherAPIModel.weatherJson();
          } catch (IOException e) {
               e.printStackTrace();
          }
     }
     public WeatherForTown(){
          JSONObject main = jsonObject.getJSONObject("main");
          JSONObject wind = jsonObject.getJSONObject("wind");
          this.feelsLikeTemperature = main.getDouble("feels_like");
          this.townName = jsonObject.getString("name");
          this.temperature = main.getDouble("temp");
          this.windSpeed = wind.getDouble("speed");
          System.out.println(feelsLikeTemperature+  " "+temperature +  " "+ townName+ " "+ windSpeed);
     }
     @Getter
     @Setter
     private String townName;
     @Getter
     @Setter
     private double temperature;
     @Getter
     @Setter
     private double feelsLikeTemperature;
     @Getter
     @Setter
     private double windSpeed;

}
