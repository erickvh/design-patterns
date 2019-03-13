package com.docker.antivirus;

import com.docker.stategy.InterfaceStrategy;

public class Contexto {
	private InterfaceStrategy estrategia;
	public Contexto(InterfaceStrategy estrategia) {
		this.estrategia=estrategia;
	}
	public void ejecutar() {
		this.estrategia.analizar();
	}
}
