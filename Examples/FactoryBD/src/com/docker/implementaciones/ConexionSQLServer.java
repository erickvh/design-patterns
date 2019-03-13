package com.docker.implementaciones;

import com.docker.interfaces.Conexion;

public class ConexionSQLServer implements Conexion {

	private String host;
	private String puerto;
	private String user;
	private String password;
	
	public ConexionSQLServer() {
		this.host="127.0.0.1";
		this.puerto="2333";
		this.user="mdo";
		this.password="demostratvo";
	}
	@Override
	public void desconectar() {
		System.out.println("Desconexion sqlserver");
		
	}

	@Override
	public void conectar() {
		System.out.println("Conexion sqlserver");
		
	}

}
