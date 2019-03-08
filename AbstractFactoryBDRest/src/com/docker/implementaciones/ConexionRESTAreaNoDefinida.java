package com.docker.implementaciones;

import com.docker.interfaces.ConexionREST;

public class ConexionRESTAreaNoDefinida implements ConexionREST{

	@Override
	public void leerURL(String url) {
		System.out.println("NO HAY DATOS");
	}

}
