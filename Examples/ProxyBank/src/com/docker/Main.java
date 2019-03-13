package com.docker;

import com.docker.interfaces.InterfaceCuenta;
import com.docker.model.Cuenta;
import com.docker.proxy.Proxy;

public class Main {

	public static void main(String[] args) {
		Cuenta cuenta= new Cuenta(2, "Erick Ventura", (double)234.22);
		
		InterfaceCuenta proxy= new Proxy();
		
		proxy.mostrarSaldo(cuenta);
		proxy.depositarDinero(cuenta, 222.88);
		proxy.retirarDinero(cuenta, 234.11);
		
	}

}
