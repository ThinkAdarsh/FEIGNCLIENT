package Feign.sampleExample;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feigndemo", url="http://localhost:7071/user/")
public interface Feignservice {

    @GetMapping("/name")
    String getName();

    @GetMapping("/address")
    String getAddress();

    @GetMapping("/status")
    String getStatus();



}
