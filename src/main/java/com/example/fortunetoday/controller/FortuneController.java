
package com.example.fortunetoday.controller;

import com.example.fortunetoday.service.FortuneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class FortuneController {

    private final FortuneService fortuneService;

    @GetMapping("/")
    public String getFortune(Model model) {
        String fortune = fortuneService.getRandomFortune();
        model.addAttribute("fortune", fortune);
        return "index";
    }

    @GetMapping("/api/fortune")
    @ResponseBody
    public String getFortuneJson() {
        return fortuneService.getRandomFortune();
    }
}
