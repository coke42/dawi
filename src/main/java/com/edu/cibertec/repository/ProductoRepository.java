package com.edu.cibertec.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.cibertec.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
