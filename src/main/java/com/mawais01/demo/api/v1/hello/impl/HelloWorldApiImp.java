package com.mawais01.demo.api.v1.hello.impl;

import com.mawais01.demo.api.v1.hello.HelloWorldApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApiImp implements HelloWorldApi {

  @Override
  public ResponseEntity<?> helloWorld() throws Exception {
    return ResponseEntity.ok("Hello World");
  }
}
