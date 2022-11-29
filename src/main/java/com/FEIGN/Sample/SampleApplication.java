package com.FEIGN.Sample;

import com.FEIGN.Sample.client.Userclient;
import com.FEIGN.Sample.dto.Userresponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SampleApplication {

	@Autowired
	private Userclient userclient;

	@GetMapping("/findusers")
	public List<Userresponse> getAllusers()
	{
		return userclient.getUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

}
