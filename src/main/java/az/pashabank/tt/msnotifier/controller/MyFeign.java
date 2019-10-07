package az.pashabank.tt.msnotifier.controller;

import az.pashabank.tt.msnotifier.model.WeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FeignClient(url = "http://localhost:8081/weather", name = "myFeign")
public interface MyFeign {

    @GetMapping("service/{cityId}")
    WeatherDTO getWeatherCities(@PathVariable Long cityId);
}
