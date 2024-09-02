package com.uade.tpo.demo.service;

import org.springframework.data.domain.Page;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.uade.tpo.demo.exceptions.CategoryDuplicateException;
import com.uade.tpo.demo.controllers.productos.ProductoRequest;
import com.uade.tpo.demo.entity.Producto;

public interface ProductoService {

    List<Producto> getAllProducts();
    Optional<Producto> getProductById(Long id);
    Producto updateProduct(Long id, Producto producto);
    boolean deleteProduct(Long id);
    Producto saveProducto(Producto producto);

    
}

