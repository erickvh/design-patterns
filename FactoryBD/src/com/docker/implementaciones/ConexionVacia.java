package com.docker.implementaciones;

import com.docker.interfaces.Conexion;

public class ConexionVacia implements Conexion {

	@Override
	public void desconectar() {
		System.out.println("Empty");
	}

	@Override
	public void conectar() {	
		System.out.println("Empty");
	}
	
	
}
