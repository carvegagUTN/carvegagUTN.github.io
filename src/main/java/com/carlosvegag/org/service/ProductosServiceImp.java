package com.carlosvegag.org.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.carlosvegag.org.model.Producto;
@Service
public class ProductosServiceImp implements intProductoService{
	private List<Producto> lista;
	public ProductosServiceImp() {
		lista=new LinkedList<Producto>();
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
			Producto p1=new Producto();
			p1.setId(1);
			p1.setNombre("Martillo");
			p1.setDescripcion("Descripcion de producto");
			p1.setPrecio(120.0);
			p1.setExistencias(5);
			//p1.setFechaProduccion(LocalDate.now());
			p1.setFechaProduccion(LocalDate.parse("05-04-2021", formato));
			p1.setImagen("default.png");
			
			Producto p2=new Producto();
			p2.setId(2);
			p2.setNombre("Pala");
			p2.setDescripcion("Descripcion de producto");
			p2.setPrecio(220.0);
			p2.setExistencias(10);
			//p2.setFechaProduccion(LocalDate.now());
			p2.setFechaProduccion(LocalDate.parse("22-02-2021", formato));
			p2.setImagen("default.png");
		
			Producto p3=new Producto();
			p3.setId(3);
			p3.setNombre("Desarmador plano");
			p3.setDescripcion("Descripcion de producto");
			p3.setPrecio(45.0);
			p3.setExistencias(8);
			//p3.setFechaProduccion(LocalDate.now());
			p3.setFechaProduccion(LocalDate.parse("12-01-2021", formato));
			p3.setImagen("default.png");
			lista.add(p1);
			lista.add(p2);
			lista.add(p3);
		}
		catch(DateTimeParseException ex) {
			System.out.println("error: "+ex.getMessage());
		}
	}
	@Override
	public List<Producto> obtenerTodos() {
		return lista;
	}

	@Override
	public void guardar(Producto producto) {
		lista.add(producto);
	}

	@Override
	public void eliminar(Integer idProducto) {
		lista.remove(idProducto);
	}

	@Override
	public Producto buscarPorId(Integer idProducto) {
		return lista.get(idProducto);
	}

}
