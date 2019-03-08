package com.docker.fachada;

import com.docker.resource.AvionREST;
import com.docker.resource.HelicopteroAPI;

public class RevisarFachada {
	private HelicopteroAPI helicoptero;
	private AvionREST avion;
	
	public RevisarFachada() {
		this.avion= new AvionREST();
		this.helicoptero= new HelicopteroAPI();
	}
	
	public void buscar(String lugar, int year) {
		helicoptero.buscarHelicopteros(lugar,year);
		avion.buscarAviones("Comalapa");
	}
}
