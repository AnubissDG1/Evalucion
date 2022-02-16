package com.example.Materiales.repositories;

import com.example.Materiales.models.Clientes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Clientes,Long> {

  
}