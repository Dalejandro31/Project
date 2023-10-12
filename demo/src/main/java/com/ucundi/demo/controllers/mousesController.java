package com.ucundi.demo.controllers;


import com.ucundi.demo.domain.mousesEntity;
import com.ucundi.demo.repositories.mousesRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class mousesController {
    private final mousesRepositories mouseR;
    @Autowired
    public mousesController(mousesRepositories mouseR){
        this.mouseR = mouseR;
    }
    @PostMapping("/createMouses")
    public ResponseEntity<mousesEntity> addMouse(@RequestBody mousesEntity mouseAdd){
        mousesEntity mouseAgregado = mouseR.save(mouseAdd);
        return new ResponseEntity<>(mouseAgregado, HttpStatus.CREATED);
    }
    @GetMapping("/readMouses")
    public String readMouse(){
        return String.valueOf(mouseR.findAll());
    }
    @GetMapping("/readMouses/{id}")
    public ResponseEntity<Object> readMouse(@PathVariable("id") String identificador) {
        String regexForID = "[1-5 a-z],{1,5}";
        if (identificador == null || !identificador.matches(regexForID))
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(mouseR.findById(Long.valueOf(identificador)));
    }
    @PutMapping("/updateMouses")
    public ResponseEntity<mousesEntity> updateMouse(@RequestBody mousesEntity mouseUpd){
        mousesEntity mouseActualizado = mouseR.save(mouseUpd);
        return  new ResponseEntity<>(mouseActualizado, HttpStatus.CREATED);
    }

    @DeleteMapping("/delteMouses/{id}")
    public  void  delteByID(@PathVariable Long id){
        mouseR.deleteById(id);
    }
}
