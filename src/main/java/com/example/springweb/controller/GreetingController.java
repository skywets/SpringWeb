package com.example.springweb.controller;

import com.example.springweb.entity.Pet;
import com.example.springweb.repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @Autowired
    private PetRepo petRepo;

    @GetMapping("/")
    public String main(Model model) {
        return "home";
    }

//    @GetMapping("/login")
//    public String message(Map<String, Object> model) {
//        return "login";
//    }

    @GetMapping("/main")
    public String main(Map<String, Object> model) {
        Iterable<Pet> messages = petRepo.findAll();

        model.put("messages", messages);

        return "main";
    }

    @PostMapping("/main")
    public String addMessage(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
        Pet message = new Pet(text, tag);
        petRepo.save(message);
        Iterable<Pet> messages = petRepo.findAll();
        model.put("messages", messages);
        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        Iterable<Pet> messages;
        if (filter != null && !filter.isEmpty()) {
            messages = petRepo.findByTag(filter);
        }else {
            messages = petRepo.findAll();
        }
        model.put("messages", messages);
        return "main";
    }

}
