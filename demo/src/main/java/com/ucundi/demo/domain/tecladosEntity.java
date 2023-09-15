package com.ucundi.demo.domain;
import javax.persistence.Entity;
import javax.persistence.Id; 

@Entity 
public class tecladosEntity {
    @Id
    private Long id;

    private String nombre;
    private String resolucion;  
    private String precio; 
    private String marca; 
}
