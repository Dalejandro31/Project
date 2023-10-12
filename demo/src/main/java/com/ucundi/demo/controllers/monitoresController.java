package com.ucundi.demo.controllers;
import com.ucundi.demo.domain.monitoresEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ucundi.demo.repositories.monitoresRepositories;

@RestController
@RequestMapping("/api")
public class monitoresController {
    private final monitoresRepositories monitoresR;
    @Autowired
    public monitoresController(monitoresRepositories monitoresR){
        this.monitoresR = monitoresR;
    }

    @PostMapping("/createMonitores")
    public ResponseEntity<monitoresEntity> addMonitor(@RequestBody monitoresEntity monitorAdd){
        monitoresEntity monitorAgregado = monitoresR.save(monitorAdd);
        return new ResponseEntity<>(monitorAgregado, HttpStatus.CREATED);
    }

    @GetMapping("/readMonitores")
    public ResponseEntity<String> readMonitores(){
        return ResponseEntity.ok(String.valueOf(monitoresR.findAll()));
    }

    @GetMapping("/readMonitores/{id}")
    public ResponseEntity<Object> readMonitores(@PathVariable("id") String identificador){
        String regexForID = "[1-5 a-z],{1,5}";
        if(identificador == null || !identificador.matches(regexForID))
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(monitoresR.findById(Long.valueOf(identificador)));
    }

    @PutMapping("/updateMonitores")
    public ResponseEntity<monitoresEntity> updateMonitor(@RequestBody monitoresEntity monitorUpd){
        monitoresEntity monitorActualizado = monitoresR.save(monitorUpd);
        return  new ResponseEntity<>(monitorActualizado, HttpStatus.CREATED);
    }

    @DeleteMapping("/delteMonitores/{id}")
    public  void  delteByID(@PathVariable Long id){
        monitoresR.deleteById(id);
    }
}
