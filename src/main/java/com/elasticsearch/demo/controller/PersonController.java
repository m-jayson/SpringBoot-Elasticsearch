package com.elasticsearch.demo.controller;

import com.elasticsearch.demo.model.Person;
import com.elasticsearch.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok(personRepository.findAll());
    }

    @PostMapping(value = "/upsert",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity upsert(@RequestBody Person person){
        this.personRepository.save(person);
        return ResponseEntity.accepted().build();
    }

}
