package io.red.jwtamigos.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("/v1/hello/")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        log.info("Acessando endpoint hello");
        return ResponseEntity.ok("Hello, hii");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> sayGoodBye(){
        return ResponseEntity.ok("Bye");
    }
}
