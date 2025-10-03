package controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome(Model model) {
        return "Welcome to the countries website!";
    }
}