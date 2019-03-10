package com.docker.commands;

import java.util.ArrayList;

public class Invocador {
	private ArrayList<InterfazOperacion> operaciones= new ArrayList<InterfazOperacion>();
	
	public void recibirOperacion(InterfazOperacion op) {
		this.operaciones.add(op);
	}
	
	public void realizarOperaciones() {
		this.operaciones.forEach(x-> x.ejecutar());
	}
}
