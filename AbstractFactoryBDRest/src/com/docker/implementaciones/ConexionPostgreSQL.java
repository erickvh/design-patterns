package com.docker.implementaciones;

import com.docker.interfaces.ConexionBD;

public class ConexionPostgreSQL implements ConexionBD{

	private String host;
	private String puerto;
	private String user;
	private String password;
	
	public ConexionPostgreSQL() {
		this.host="127.0.0.1";
		this.puerto="5432";
		this.user="postgres";
		this.password="helloworld";
	}
	
	@Override
	public void desconectar() {
		System.out.println("Desconexion pgsql");
	}

	@Override
	public void conectar() {
		System.out.println("Conexion pgsql");
		
	}

}
