package com.docker.proxy;

import com.docker.implementacion.CuentaBancoA;
import com.docker.interfaces.InterfaceCuenta;
import com.docker.model.Cuenta;

public class Proxy implements InterfaceCuenta {
	private CuentaBancoA cuentaReal;
	
	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		if(cuentaReal==null) {
			cuentaReal= new CuentaBancoA();
			return cuentaReal.retirarDinero(cuenta, monto);
		}
		else
		{
			return cuentaReal.retirarDinero(cuenta, monto);
		}
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		if(cuentaReal==null) {
			cuentaReal= new CuentaBancoA();
			return cuentaReal.depositarDinero(cuenta, monto);
		}
		else
		{
			return cuentaReal.depositarDinero(cuenta, monto);
		}
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		if(cuentaReal==null) {
			cuentaReal= new CuentaBancoA();
			cuentaReal.mostrarSaldo(cuenta);
		}
		else
		{
			cuentaReal.mostrarSaldo(cuenta);
		}
		
	}

}
