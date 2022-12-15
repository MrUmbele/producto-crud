package com.formacion.apirest.service;

import java.util.List;

import com.formacion.apirest.entity.Producto;

public interface ProductoService {
	public List<Producto> mostrarProductos();

	public Producto buscarProducto(Long id);

	public Producto guardarProducto(Producto producto);

	public Producto borrarProducto(Long id);
}
