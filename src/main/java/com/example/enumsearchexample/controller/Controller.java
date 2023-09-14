package com.example.enumsearchexample.controller;


import com.example.enumsearchexample.service.Answers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/enum-search")
public class Controller {

    @GetMapping("/{param}")
    public ResponseEntity<String> getAnswer(@PathVariable String param) {

        return new ResponseEntity<>(Answers.findAnswer(param), HttpStatus.OK);

    }
}
