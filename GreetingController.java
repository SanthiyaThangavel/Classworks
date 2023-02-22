package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class GreetingController {
  @Value("${hello.value}")
  private String WelcomeSalutation;
  @GetMapping("/hi")
  public String home() {
	  return WelcomeSalutation+",World!";
  }
}
