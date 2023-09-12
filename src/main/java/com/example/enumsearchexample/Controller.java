package com.example.enumsearchexample;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/enum-search")
public class Controller {

    @GetMapping("/{param}")
    public ResponseEntity<String> getAnswer(@PathVariable("param") String param){

        return new ResponseEntity<>(AnswersService.Answer(param), HttpStatus.OK);

    }
}
