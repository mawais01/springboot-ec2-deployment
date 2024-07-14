package com.mawais01.demo.api.v1.hello;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1")
public interface HelloWorldApi {

  @GetMapping("hello")
  ResponseEntity<?> helloWorld() throws Exception;

}
