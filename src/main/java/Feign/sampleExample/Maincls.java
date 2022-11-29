package Feign.sampleExample;

import com.FEIGN.Sample.SampleApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Maincls {

    public static void main(String[] args) {
        SpringApplication.run(Maincls.class, args);
    }
}
