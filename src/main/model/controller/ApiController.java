package model.controller;


import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiController {

    public static LinkedTreeMap getWeather() throws IOException {
        BufferedReader br = getApiData();
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            StringBuilder append = sb.append(line);
            sb.append(System.lineSeparator());
        }
        String data = sb.toString();
        return (LinkedTreeMap) new Gson().fromJson(data, Object.class);
    }

    private static BufferedReader getApiData() throws IOException {
        BufferedReader br = null;
        String apikey = "11c8030b079f612b29b110460189f02e\n"; //fill this in with the API key they email you
        String weatherquery = "https://api.openweathermap.org/data/2.5/weather?q=Vancouver,ca&APPID=";
        String theUrl = weatherquery + apikey;
        URL url = null;
        url = new URL(theUrl);
        br = new BufferedReader(new InputStreamReader(url.openStream()));
        return br;
    }
}