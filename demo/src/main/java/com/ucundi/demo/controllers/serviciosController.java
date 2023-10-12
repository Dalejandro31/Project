package com.ucundi.demo.controllers;
import com.ucundi.demo.domain.monitoresEntity;
import com.ucundi.demo.domain.serviciosEntity;
import com.ucundi.demo.repositories.monitoresRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ucundi.demo.repositories.serviciosRepositories;
@RestController
@RequestMapping("/api")
public class serviciosController {
    private final serviciosRepositories serviciosR;
    @Autowired
    public serviciosController(serviciosRepositories serviciosR){
        this.serviciosR = serviciosR;
    }

    @PostMapping("/createServicios")
    public ResponseEntity<serviciosEntity> addServicios(@RequestBody serviciosEntity servicioAdd){
        serviciosEntity servicioAgregado = serviciosR.save(servicioAdd);
        return new ResponseEntity<>(servicioAgregado, HttpStatus.CREATED);
    }

    @GetMapping("/readServicios")
    public ResponseEntity<String> readServicios(){
        return ResponseEntity.ok(String.valueOf(serviciosR.findAll()));
    }

    @GetMapping("/readServicios/{id}")
    public ResponseEntity<Object> readServicios(@PathVariable("id") String identificador){
        String regexForID = "[1-5 a-z],{1,5}";
        if(identificador == null || !identificador.matches(regexForID))
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(serviciosR.findById(Long.valueOf(identificador)));
    }

    @PutMapping("/updateServicios")
    public ResponseEntity<serviciosEntity> updateServicios(@RequestBody serviciosEntity servicioUpd){
        serviciosEntity servicioActualizado = serviciosR.save(servicioUpd);
        return  new ResponseEntity<>(servicioActualizado, HttpStatus.CREATED);
    }

    @DeleteMapping("/delteServicios/{id}")
    public  void  delteByID(@PathVariable Long id){
        serviciosR.deleteById(id);
    }
}
