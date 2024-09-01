package com.uade.tpo.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "especificaciones_tecnicas")
public class EspecificacionTecnica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspeTecnicas;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    private String clave;
    private String valor;
}