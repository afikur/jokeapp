package com.afikur.jokeapp.controller;

import com.afikur.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokeController {
    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJokes());
        return "chucknorris";
    }
}
