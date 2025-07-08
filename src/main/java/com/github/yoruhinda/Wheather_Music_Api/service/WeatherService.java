package com.github.yoruhinda.Wheather_Music_Api.service;

import com.github.yoruhinda.Wheather_Music_Api.models.Climate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class WeatherService {
    private String apikey;
    private final RestTemplate restTemplate;

    public WeatherService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Climate getClimateFromApi(float lat, float lon) {
        String api = "https://api.openweathermap.org/data/3.0/onecall?lat=" + lat + "&lon=" + lon + "&appid=" + apikey;
        return null;
    }
}
