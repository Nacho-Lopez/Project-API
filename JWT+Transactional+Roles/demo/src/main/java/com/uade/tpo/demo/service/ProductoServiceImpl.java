package com.uade.tpo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.uade.tpo.demo.controllers.productos.ProductoRequest;
import com.uade.tpo.demo.entity.Producto;
import com.uade.tpo.demo.repository.ProductoRepository;

import java.util.List;
import java.util.Optional;


@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto updateProduct(Long idProducto, Producto producto) {
        Producto existingProducto = productoRepository.findById(idProducto)
            .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        existingProducto.setNombre(producto.getNombre());
        existingProducto.setPrecio(producto.getPrecio());
        existingProducto.setDescripcion(producto.getDescripcion());
        existingProducto.setCantidad(producto.getCantidad());
        //existingProducto.setEspecificacionesTecnicas(productRequest.getEspecificacionesTecnicas());
        // No actualizar fotosProducto directamente para no afectar la funcionalidad existente
        return productoRepository.save(existingProducto);
    }
    
    @Override
    public boolean deleteProduct(Long id) {
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public Optional<Producto> getProductById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public List<Producto> getAllProducts() {
        return productoRepository.findAll();
    }


}
