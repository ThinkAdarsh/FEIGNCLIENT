package com.FEIGN.Sample.client;

import com.FEIGN.Sample.dto.Userresponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@FeignClient(url="https://jsonplaceholder.typicode.com", name="USER")
public interface Userclient {

    @GetMapping("/users")
    public List<Userresponse> getUsers();


}
