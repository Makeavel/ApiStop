package com.app.stop.controller;

import com.app.stop.db.Stop;
import com.app.stop.repository.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RequestMapping("api/stop")
public class StopController {

    @Autowired
    private final StopRepository stopRepository;
    @Autowired
    private StopService service;

    public StopController(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Stop create(@RequestBody Stop letras){
        return stopRepository.save(letras);
    }

    @GetMapping("/caracter/{id}")
    public Stop readId(@PathVariable String id){
        return stopRepository.findById(id).orElseThrow( ()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found"));
    }

    @GetMapping("/")
    public List<Stop> readAll(){
        return stopRepository.findAll();
    }

    @GetMapping("/{nome}/{id}")
    public Stop readNome(@PathVariable String nome , String id){
        return service.findNome(nome , id);
    }
    @GetMapping("/{sobrenome}/{id}")
    public Stop readSobrenome(@PathVariable String sobrenome , String id){
        return service.findSobrenome(sobrenome , id);
    }
    @GetMapping("/{animal}/{id}")
    public Stop readAnimal(@PathVariable String animal , String id){
        return service.findAnimal(animal , id);
    }
    @GetMapping("/{bebidas}/{id}")
    public Stop readBebida(@PathVariable String bebida , String id){
        return service.findBebida(bebida, id);
    }
    @GetMapping("/{banda}/{id}")
    public Stop readBanda(@PathVariable String banda , String id){
        return service.findBanca(banda , id);
    }
    @GetMapping("/{cor}/{id}")
    public Stop readCor(@PathVariable String cor , String id){
        return service.findCor(cor , id);
    }    
    @GetMapping("/{cidade}/{id}")
    public Stop readCidade(@PathVariable String cidade , String id){
        return service.findCidade(cidade , id);
    }
    @GetMapping("/{comida}/{id}")
    public Stop readComida(@PathVariable String comida , String id){
        return service.findComida(comida , id);
    }
    @GetMapping("/{carro}/{id}")
    public Stop readCaro(@PathVariable String carro , String id){
        return service.findCarro(carro , id);
    }
    @GetMapping("{doce}/{id}")
    public Stop readDoce(@PathVariable String doce , String id){
        return service.findDoce(doce , id);
    }
    @GetMapping("/{eletronico}/{id}")
    public Stop readEletronico(@PathVariable String eletronico , String id){
        return service.findEletronico(eletronico , id);
    }
    @GetMapping("/{esporte}/{id}")
    public Stop readEsporte(@PathVariable String esporte , String id){
        return service.findEsporte(esporte , id);
    }
    @GetMapping("/{flor}/{id}")
    public Stop readFlor(@PathVariable String flor , String id){
        return service.findFLor(flor , id);
    }
    
}
