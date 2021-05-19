package com.carlosvegag.org.service;

import java.util.List;

import com.carlosvegag.org.model.Producto;

public interface intProductoService {
	public List<Producto> obtenerTodos();
	public void guardar(Producto producto);
	public void eliminar(Integer idProducto);
	public Producto buscarPorId(Integer idProducto);
}
