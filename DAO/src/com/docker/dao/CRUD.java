package com.docker.dao;

import java.util.List;


public interface CRUD <T>{
	List<T> listarTodos();
	T leerPorID(int id);
	void registrar(T generico);
	void actualizar(T generico);
	void eliminar(int id);
}
