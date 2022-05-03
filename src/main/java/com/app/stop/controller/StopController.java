package com.app.stop.controller;

import com.app.stop.db.Stop;
import com.app.stop.repository.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("api/stop")
public class StopController {

    @Autowired
    private final StopRepository stopRepository;

    public StopController(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    @GetMapping("/letra/{id}")
    public Stop readAll(@PathVariable String id){

        return stopRepository.findById(id).orElseThrow( ()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found"));
    }


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Stop create(@RequestBody Stop letras){

        return stopRepository.save(letras);
    }

}
