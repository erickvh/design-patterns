package com.docker.implementaciones;

import com.docker.interfaces.Conexion;

public class ConexionOracle implements Conexion {

	private String host;
	private String puerto;
	private String user;
	private String password;
	
	public ConexionOracle() {
		this.host="127.0.0.1";
		this.puerto="4444";
		this.user="pdo";
		this.password="demostratvo";
	}
	@Override
	public void desconectar() {
		System.out.println("Desconexion oracle");
		
	}

	@Override
	public void conectar() {
		System.out.println("Conexion oracle");
		
	}

}
