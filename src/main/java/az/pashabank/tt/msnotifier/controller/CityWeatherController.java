package az.pashabank.tt.msnotifier.controller;

import az.pashabank.tt.msnotifier.mockData.MockData;
import az.pashabank.tt.msnotifier.model.CityAndWeatherModel;
import az.pashabank.tt.msnotifier.model.CityDTO;
import az.pashabank.tt.msnotifier.model.WeatherDTO;
import az.pashabank.tt.msnotifier.service.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("city")
public class CityWeatherController {
    private final CityService cityService;
    private final MyFeign myFeign;
    private final MockData mockData;

    public CityWeatherController(CityService cityService, MyFeign myFeign, MockData mockData) {
        this.cityService = cityService;
        this.myFeign = myFeign;
        this.mockData = mockData;
    }


    @GetMapping
    public CityAndWeatherModel cityAndWeatherModel() {
        return cityService.cityAndWeatherModel();
    }

    @PostMapping
    public List<WeatherDTO> getWeatherCities(@RequestParam CityDTO[] cityDTOS) {
        List<WeatherDTO> weatherDTOS =new ArrayList<>();
        for (CityDTO cityDTO : cityDTOS) {
            WeatherDTO weatherDTO = myFeign.getWeatherCities(cityDTO.getId());
            mockData.addData(weatherDTO.getCityId(), null);
            weatherDTOS.add(myFeign.getWeatherCities(cityDTO.getId()));
        }
//        cityService.setCityAndWeatherModel();
        return weatherDTOS;
    }
}
