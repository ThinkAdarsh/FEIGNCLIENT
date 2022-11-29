package com.Feignexample.demofeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {

    @GetMapping("/name")
    public String getName()
    {
        return "Adarsh kumar";
    }

     @GetMapping("/address")
    public String getAddress()
    {
        return "BBSR";
    }

    @GetMapping("/status")
    public String getStatus()
    {
        return "active mode";
    }
}
