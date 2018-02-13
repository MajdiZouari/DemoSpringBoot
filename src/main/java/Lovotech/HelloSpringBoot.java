package Lovotech;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class HelloSpringBoot {

    @RequestMapping("/")
    String home() {
        return "Lovotech : Bonjour Spring Boot !";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloSpringBoot.class, args);
    }

}