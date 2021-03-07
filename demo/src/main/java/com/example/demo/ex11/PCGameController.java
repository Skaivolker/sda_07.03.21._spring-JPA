package com.example.demo.ex11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PCGameController {

    @GetMapping("/pg-games")
    public String home(){
        return "pcgame";
    }
}
