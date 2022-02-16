package com.example.Materiales.Services;

import com.example.Materiales.repositories.ClienteRepository;
import com.example.Materiales.repositories.ProductosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialesService {
    @Autowired 
   ClienteRepository CRepo; 
   ProductosRepository PRepo;

}
