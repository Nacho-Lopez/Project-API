package com.uade.tpo.demo.entity;

import java.util.List;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    private String nombre;
    private double precio;
    private String descripcion;
    private int cantidad;

    @OneToMany(mappedBy = "producto")
    private List<EspecificacionTecnica> especificacionesTecnicas;

    @OneToMany(mappedBy = "producto")
    private List<FotoProducto> fotosProducto;

    @OneToMany(mappedBy = "producto")
    private List<CarritoProducto> carritoProductos;

    @OneToMany(mappedBy = "producto")
    private List<OrdenProducto> ordenProductos;
}
