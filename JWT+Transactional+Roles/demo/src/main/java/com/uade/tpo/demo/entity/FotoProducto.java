package com.uade.tpo.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "fotos_producto")
public class FotoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFotoProducto;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Lob
    private byte[] foto;
}
