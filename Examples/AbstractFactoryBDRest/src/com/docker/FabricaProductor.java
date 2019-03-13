package com.docker;

import com.docker.interfaces.FabricaAbstracta;

public abstract class FabricaProductor {
	public static FabricaAbstracta getConexion(String fabrica) {
		
		if(fabrica.equals("BD")) {
			return new ConexionBDFabrica();
		}
		else if(fabrica.equals("REST"))
		{
			return new ConexionRESTFabrica();
		}
		else {
		System.out.println("no definido");
		return null;
		}
	
	}
}
