package com.docker.stategy;

public abstract class AnalisisSimple implements InterfaceStrategy {

	public void analizar() {
		iniciar();
		saltarExe();
		detener();
	}
	protected abstract void detener();
	protected abstract void saltarExe();
	protected abstract void iniciar();

}
