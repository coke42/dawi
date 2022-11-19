package com.edu.cibertec.service;
import java.util.List;

import com.edu.cibertec.model.Producto;

public interface ProductoService {

	List<Producto> obtenerTodos();
	void guardar(Producto o);
	Producto getProductoById(int id);
	void eliminarProductoById(int id);

}
