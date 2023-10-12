package com.ucundi.demo.controllers;
import com.ucundi.demo.domain.monitoresEntity;
import com.ucundi.demo.domain.tecladosEntity;
import com.ucundi.demo.repositories.monitoresRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ucundi.demo.repositories.tecladosRepositories;

@RestController
@RequestMapping("/api")
public class tecladosController {
    private final tecladosRepositories tecladosR;
    @Autowired
    public tecladosController(tecladosRepositories tecladosR){
        this.tecladosR = tecladosR;
    }

    @PostMapping("/createTeclados")
    public ResponseEntity<tecladosEntity> addTeclado(@RequestBody tecladosEntity tecladoAdd){
        tecladosEntity tecladoAgregado = tecladosR.save(tecladoAdd);
        return new ResponseEntity<>(tecladoAgregado, HttpStatus.CREATED);
    }

    @GetMapping("/readTeclados")
    public ResponseEntity<String> readTeclados(){
        return ResponseEntity.ok(String.valueOf(tecladosR.findAll()));
    }

    @GetMapping("/readTeclados/{id}")
    public ResponseEntity<Object> readTeclados(@PathVariable("id") String identificador){
        String regexForID = "[1-5 a-z],{1,5}";
        if(identificador == null || !identificador.matches(regexForID))
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(tecladosR.findById(Long.valueOf(identificador)));
    }

    @PutMapping("/updateTeclados")
    public ResponseEntity<tecladosEntity> updateTeclados(@RequestBody tecladosEntity tecladosUpd){
        tecladosEntity tecladoActualizado = tecladosR.save(tecladosUpd);
        return  new ResponseEntity<>(tecladoActualizado, HttpStatus.CREATED);
    }

    @DeleteMapping("/delteTeclados/{id}")
    public  void  delteByID(@PathVariable Long id){
        tecladosR.deleteById(id);
    }
}
