package az.pashabank.tt.msnotifier.mockData;

import az.pashabank.tt.msnotifier.model.CityAndWeatherModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Getter
@Setter
public class MockData {
    private static Map<Long, CityAndWeatherModel> map = new HashMap<>();

    public void addData(long id, CityAndWeatherModel cityAndWeatherModel){
        map.put(id, cityAndWeatherModel);
    }
}
