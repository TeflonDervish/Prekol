package ru.semenov.Prekol.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/emilia")
    public String getEmilia(Model model) {
        return "emilia.html";
    }

}
