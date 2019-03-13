package com.docker;

import com.docker.implementaciones.ConexionMySQL;
import com.docker.implementaciones.ConexionOracle;
import com.docker.implementaciones.ConexionPostgreSQL;
import com.docker.implementaciones.ConexionSQLServer;
import com.docker.implementaciones.ConexionVacia;
import com.docker.interfaces.Conexion;

public class ConexionFabrica {
	
	public static Conexion obtenerConexion(String tipo) {
		if(tipo.equals("MySQL"))
		{
			return new ConexionMySQL();
		}
		else if(tipo.equals("PostgreSQL"))
		{
			return new ConexionPostgreSQL();			
		}
		else if(tipo.equals("Oracle"))
		{
			return new ConexionOracle();
		}
		else if(tipo.equals("SQLserver")) {
			return new ConexionSQLServer();
		}
		else {
			return new ConexionVacia();
		}
		
	}
}
