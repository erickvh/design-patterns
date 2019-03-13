package com.docker.antivirus;

import com.docker.stategy.AnalisisSimple;

public class AntivirusBasico extends AnalisisSimple {

	@Override
	protected void detener() {
		System.out.println("Deteniendo antivirus simplex, stopping...Terminado");		
	}

	@Override
	protected void saltarExe() {
		try {
			System.out.println("Analizando...");
			Thread.sleep(2500);
			System.out.println("Salto los .exe no se analizan.");			
		} catch (Exception e) {
			// TODO: handle exception
		}
;		
	}

	@Override
	protected void iniciar() {
		System.out.println("Inicio con antivirus simplex, ejecutando...");
	}

}
