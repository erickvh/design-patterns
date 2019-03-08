package com.docker;

import com.docker.implementaciones.ConexionRESTAreaNoDefinida;
import com.docker.implementaciones.ConexionRESTCompras;
import com.docker.implementaciones.ConexionRESTFacturas;
import com.docker.implementaciones.ConexionRESTVentas;
import com.docker.interfaces.ConexionBD;
import com.docker.interfaces.ConexionREST;
import com.docker.interfaces.FabricaAbstracta;

public class ConexionRESTFabrica implements FabricaAbstracta{

	@Override
	public ConexionBD getBD(String motor) {
		return null;
	}

	@Override
	public ConexionREST getRest(String area) {
		if(area.equals("compra")) {
			return new ConexionRESTCompras();
		}
		else if(area.equals("venta")) {
			return new ConexionRESTVentas();
		}
		else if(area.equals("factura")) {
			return new ConexionRESTFacturas();
		}
		else {
			return new ConexionRESTAreaNoDefinida();
		}
	}

}
