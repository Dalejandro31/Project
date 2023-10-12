package com.ucundi.demo.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity 
public class mousesEntity {

    public mousesEntity(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof mousesEntity that)) return false;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String resolucion;  
    private String precio; 
    private String marca;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public mousesEntity(String nombre, String resolucion, String precio, String marca) {
        this.nombre = nombre;
        this.resolucion = resolucion;
        this.precio = precio;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "mousesEntity [id=" + id + ", nombre=" + nombre + ", resolucion=" + resolucion + ", precio=" + precio
                + ", marca=" + marca + "]";
    } 
}
