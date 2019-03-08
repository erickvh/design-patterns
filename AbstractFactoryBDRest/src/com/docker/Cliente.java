package com.docker;

import com.docker.interfaces.ConexionBD;
import com.docker.interfaces.ConexionREST;
import com.docker.interfaces.FabricaAbstracta;

public class Cliente {

	public static void main(String[] args) {
		FabricaAbstracta fab=FabricaProductor.getConexion("BD");
		ConexionBD mysql= fab.getBD("MySQL");
		mysql.conectar();
		mysql.desconectar();
		
		
		fab= FabricaProductor.getConexion("REST");
		ConexionREST rest= fab.getRest("factura");
		rest.leerURL("https://url.com/facturas?fecha=2019");
	}

}
