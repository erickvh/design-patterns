package com.docker.stategy;

public abstract class AnalisisIntermedio  implements InterfaceStrategy{

	public void analizar() {
		iniciar();
		cargarMemoria();
		descomprimirZips();
		analizarZips();
		analizarExe();
	}

	protected abstract void analizarExe();

	protected abstract void analizarZips();

	protected abstract void descomprimirZips();

	protected abstract void cargarMemoria();

	protected abstract void iniciar();

}
