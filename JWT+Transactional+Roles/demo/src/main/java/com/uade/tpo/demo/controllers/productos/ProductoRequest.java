package com.uade.tpo.demo.controllers.productos;

import lombok.Data;

@Data
public class ProductoRequest {

    private String nombre;
    private String description;
    private Double precio;

}
