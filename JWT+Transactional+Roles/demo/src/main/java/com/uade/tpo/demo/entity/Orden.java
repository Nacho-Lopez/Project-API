package com.uade.tpo.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "ordenes")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrden;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private User user;

    @Temporal(TemporalType.DATE)
    private Date fechaOrden;

    private String metodoPago;
    private double descuento;
    private double total;
    private double totalConDescuento;
    private String estado;

    @OneToMany(mappedBy = "orden")
    private List<OrdenProducto> ordenProductos;
}