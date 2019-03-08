package com.docker.implementaciones;

import com.docker.interfaces.ConexionREST;

public class ConexionRESTVentas implements ConexionREST{

	@Override
	public void leerURL(String url) {
		System.out.println("Datos ventas: "+url);
		
	}

}
