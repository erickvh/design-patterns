package com.docker;

import com.docker.implementaciones.ConexionMySQL;
import com.docker.implementaciones.ConexionOracle;
import com.docker.implementaciones.ConexionPostgreSQL;
import com.docker.implementaciones.ConexionSQLServer;
import com.docker.implementaciones.ConexionVacia;
import com.docker.interfaces.ConexionBD;
import com.docker.interfaces.ConexionREST;
import com.docker.interfaces.FabricaAbstracta;

public class ConexionBDFabrica implements FabricaAbstracta {

	@Override
	public ConexionBD getBD(String motor) {

		if(motor.equals("MySQL"))
		{
			return new ConexionMySQL();
		}
		else if(motor.equals("PostgreSQL"))
		{
			return new ConexionPostgreSQL();			
		}
		else if(motor.equals("Oracle"))
		{
			return new ConexionOracle();
		}
		else if(motor.equals("SQLserver")) {
			return new ConexionSQLServer();
		}
		else {
			return new ConexionVacia();
		}
	}

	@Override
	public ConexionREST getRest(String area) {
		// TODO Auto-generated method stub
		return null;
	}
	
		

}
