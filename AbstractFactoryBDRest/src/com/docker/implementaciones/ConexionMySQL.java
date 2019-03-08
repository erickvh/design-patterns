package com.docker.implementaciones;

import com.docker.interfaces.ConexionBD;

public class ConexionMySQL implements ConexionBD{

	private String host;
	private String puerto;
	private String user;
	private String password;
	
	public ConexionMySQL() {
		this.host="127.0.0.1";
		this.puerto="3310";
		this.user="root";
		this.password="demostratvo";
	}	
	@Override
	public void desconectar() {
		System.out.println("Desconexion Mysql");
		
	}

	@Override
	public void conectar() {
		System.out.println("conexion Mysql");
		
	}

}
