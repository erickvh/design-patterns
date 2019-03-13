package com.docker.interfaces;

import com.docker.model.Cuenta;

public interface InterfaceCuenta {
	Cuenta retirarDinero( Cuenta cuenta, double monto);
	Cuenta depositarDinero( Cuenta cuenta, double monto);
	void mostrarSaldo( Cuenta cuenta);
}
