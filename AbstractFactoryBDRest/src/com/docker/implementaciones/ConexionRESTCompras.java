package com.docker.implementaciones;

import com.docker.interfaces.ConexionREST;

public class ConexionRESTCompras implements ConexionREST{

	@Override
	public void leerURL(String url) {
		System.out.println("Datos compras: "+url);
		
	}

}
