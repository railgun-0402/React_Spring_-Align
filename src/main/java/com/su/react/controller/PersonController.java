package com.su.react.controller;

import com.su.react.model.Person;
import com.su.react.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api")
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable("id") String id) {
        return service.getPerson(Integer.parseInt(id));
    }

    @PutMapping("/person/update")
    public void updatePerson(@Validated @RequestBody Person person, BindingResult result) {
        if (result.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError error: result.getFieldErrors()) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
        }
        service.updatePerson(person);
    }
}
