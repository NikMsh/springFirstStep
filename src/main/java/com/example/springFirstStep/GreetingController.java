package com.example.springFirstStep;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping
    public String main(Map<String,Object> model) {
        model.put("sms","Main page");
        return "main";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World")
                           String name,
                           Model model
    ) {
        model.addAttribute("name",name);
        return "greeting";
    }
}
