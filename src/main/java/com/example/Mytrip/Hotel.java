package com.example.Mytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hotel {
    @GetMapping("/myHotel")
    public String getData(){
        return "Please book your Hotel here";
    }

}
