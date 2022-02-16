package com.example.Materiales.models;

import javax.persistence.*;

@Entity
@Table(name = "Clientes")
public class Clientes {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )

    private Long id;

    private String nombre;
    private String apellido;
    private String direccion;
    private Integer edad;
    private String Factura;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFactura() {
        return Factura;
    }
    public void setFactura(String factura) {
        this.Factura = factura;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    


}


