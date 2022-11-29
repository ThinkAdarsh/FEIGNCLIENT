package Feign.sampleExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeignController {

    @Autowired
    private Feignservice feignservice;

    @GetMapping("/username")
    public String getUsername()
    {
        return feignservice.getName();
    }

    @GetMapping("/address")
    public String getAddress()
    {
        return feignservice.getAddress();
    }

    @GetMapping("/status")
    public String getStatus()
    {
        return feignservice.getStatus();
    }
}
