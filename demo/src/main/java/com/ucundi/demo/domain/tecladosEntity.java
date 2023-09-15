package com.ucundi.demo.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 

@Entity 
public class tecladosEntity {

    public tecladosEntity(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String resolucion;  
    private String precio; 
    private String marca;

    
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResolucion() {
        return resolucion;
    }

    public String getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public tecladosEntity(String nombre, String resolucion, String precio, String marca) {
        this.nombre = nombre;
        this.resolucion = resolucion;
        this.precio = precio;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "tecladosEntity [id=" + id + ", nombre=" + nombre + ", resolucion=" + resolucion + ", precio=" + precio
                + ", marca=" + marca + "]";
    } 
}
