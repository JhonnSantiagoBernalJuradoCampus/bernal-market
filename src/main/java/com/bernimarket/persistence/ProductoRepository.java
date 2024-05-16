package com.bernimarket.persistence;

import com.bernimarket.persistence.crud.ProductoCrudRepository;
import com.bernimarket.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
