package com.ray.cf1400.explorer.controller;

import com.ray.cf1400.explorer.repository.ForeignTradeEntranceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExplorerController {

    private final ForeignTradeEntranceRepository repository;

    public ExplorerController(ForeignTradeEntranceRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("entries", repository.findAll());
        return "index";
    }
}