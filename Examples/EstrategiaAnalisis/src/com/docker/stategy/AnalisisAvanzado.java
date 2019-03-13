package com.docker.stategy;

public abstract class AnalisisAvanzado implements InterfaceStrategy {
	public void analizar() {
		iniciar();
		cargarMemoria();
		descomprimirZips();
		analizarZips();
		analizarExe();
		busquedaKeyLogger();
		revisionCookies();
		analisisRed();
	}




	protected abstract void analisisRed();




	protected abstract void busquedaKeyLogger();




	protected abstract void revisionCookies();




	protected abstract void analizarExe();

	protected abstract void cargarMemoria();

	protected abstract void iniciar();

	protected abstract void analizarZips();
	protected abstract void descomprimirZips();
}
