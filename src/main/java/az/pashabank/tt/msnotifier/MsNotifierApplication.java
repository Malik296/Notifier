package az.pashabank.tt.msnotifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MsNotifierApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsNotifierApplication.class, args);
    }

}
