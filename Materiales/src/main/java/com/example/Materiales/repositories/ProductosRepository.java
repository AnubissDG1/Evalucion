package com.example.Materiales.repositories;



import com.example.Materiales.models.Productos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends CrudRepository<Productos,Long> {

  
}
