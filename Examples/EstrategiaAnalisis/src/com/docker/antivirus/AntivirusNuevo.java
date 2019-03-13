package com.docker.antivirus;

import com.docker.stategy.AnalisisIntermedio;

public class AntivirusNuevo extends AnalisisIntermedio {

	@Override
	protected void analizarExe() {
		System.out.println("Analisis de archivos .exe completado");
	}

	@Override
	protected void analizarZips() {
		System.out.println("Analizando zip, ejecutando...");	
		try {
			Thread.sleep(2000);
			System.out.println("Analizado correctamente");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void descomprimirZips() {
		try {
			System.out.println("Descomprimiendo zip, ejecutando...");
			Thread.sleep(2000);
			System.out.println("Descomprimidos...");
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@Override
	protected void cargarMemoria() {
		System.out.println("Cargando discos duros, ejecutando...");		
	}

	@Override
	protected void iniciar() {
		System.out.println("Inicio con antivirus nuevo intermex, ejecutando...");		
	}

}
