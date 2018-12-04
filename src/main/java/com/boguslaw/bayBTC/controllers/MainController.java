package com.boguslaw.bayBTC.controllers;

import com.boguslaw.bayBTC.models.AllModel;
import com.boguslaw.bayBTC.models.BayModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {


    @GetMapping("/")

    public String index(Model model) {

        return "index";
    }

    @PostMapping("/")
    public String index(@RequestParam("cryptocurrency") String cryptocurrency, Model model) {

        String link = "https://bitbay.net/API/Public/" + cryptocurrency + "PLN/orderbook.json";
        String link2 = "https://bitbay.net/API/Public/" + cryptocurrency + "PLN/ticker.json";
        RestTemplate restTemplate = new RestTemplate();
        BayModel bayModel = restTemplate.getForObject(link, BayModel.class);
        model.addAttribute("bids", bayModel.getBids()[0][0]);
        model.addAttribute("asks", bayModel.getAsks()[0][0]);
        AllModel allModel = restTemplate.getForObject(link2, AllModel.class);
        model.addAttribute("min",allModel.getMin());
        model.addAttribute("max",allModel.getMax());
        model.addAttribute("vwap",allModel.getVwap());
        model.addAttribute("volume",allModel.getVolume());



        return "index";

    }
}
