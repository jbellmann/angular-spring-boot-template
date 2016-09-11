package de.jbellmann.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public HelloMessage hello(){
        System.out.println("hello invoked");
        return new HelloMessage();
    }

    @GetMapping(value = "/klaus", params = {"message"})
    public HelloMessage helloWithParam(@RequestParam(value = "message", required = true) String message){
        System.out.println("klaus_world");
        return new HelloMessage(message);
    }
}
