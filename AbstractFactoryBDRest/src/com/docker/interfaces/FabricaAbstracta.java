package com.docker.interfaces;

public interface FabricaAbstracta {
	ConexionBD getBD(String motor);
	ConexionREST getRest(String area);
	
}
