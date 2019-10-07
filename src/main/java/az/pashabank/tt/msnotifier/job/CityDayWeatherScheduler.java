package az.pashabank.tt.msnotifier.job;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class CityDayWeatherScheduler {

    @Scheduled(fixedDelay = 10000)
    void refreshWeather() {

    }
}
