package com.example.weathersite.Model;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;


public class WeatherAPIModel {
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject weatherJson() throws IOException, JSONException {
        InputStream is = new URL("yourOpenWeatherAPI").openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }
}
