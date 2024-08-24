package com.su.react.controller;

import com.su.react.model.BirthStone;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {
    @GetMapping("/api")
    @ResponseBody
    public BirthStone getBirthStone() {
        BirthStone birthStone = new BirthStone();
        birthStone.setMonth("2月");
        birthStone.setName("アメジスト");
        birthStone.setColor("紫");
        return birthStone;
    }
}
