package com.docker;

import com.docker.interfaces.Conexion;

public class Cliente {

	public static void main(String[] args) {
		Conexion mysql=ConexionFabrica.obtenerConexion("MySQL");
		mysql.conectar();
		mysql.desconectar();
		Conexion oracle = ConexionFabrica.obtenerConexion("Oracle");
		oracle.conectar();
		oracle.desconectar();
		Conexion sqlserver = ConexionFabrica.obtenerConexion("M");
		sqlserver.conectar(); //it fails
		
		sqlserver= ConexionFabrica.obtenerConexion("SQLserver");
		sqlserver.conectar();
		sqlserver.desconectar();
		
	}

}
