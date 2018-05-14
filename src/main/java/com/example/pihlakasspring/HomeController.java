package com.example.pihlakasspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    @CrossOrigin(origins = "http://localhost:3000")
    public String index() {
        return "index";
    }

}
