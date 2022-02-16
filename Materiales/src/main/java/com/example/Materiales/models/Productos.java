package com.example.Materiales.models;

import javax.persistence.*;

@Entity
@Table(name = "Productos")
public class Productos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )

    private Long id;
    
    private String nombre;
    private String precio;
    private Integer Cantidad;
    private String Descripcion;

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }
    public Integer getCantidad() {
        return Cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.Cantidad = cantidad;
    }
    
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
   
}
