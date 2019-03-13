package com.docker;

import com.docker.commands.Cuenta;
import com.docker.commands.DepositarImplementacion;
import com.docker.commands.Invocador;
import com.docker.commands.RetirarImplementacion;

public class Main {
	public static void main(String ...args) {
		Cuenta cuenta = new Cuenta(2, 323.11);
		DepositarImplementacion opDeposito= new DepositarImplementacion(cuenta, 100.34);
		RetirarImplementacion opRetiro = new RetirarImplementacion(cuenta, 299.11);
		
		Invocador inv= new Invocador();
		inv.recibirOperacion(opDeposito);
		inv.recibirOperacion(opRetiro);
		inv.realizarOperaciones();
	}
}
