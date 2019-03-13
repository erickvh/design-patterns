package com.docker;

import com.docker.antivirus.AntivirusNuevo;
import com.docker.antivirus.Contexto;

public class Main {
	public static void main(String ...args) {
		Contexto contexto = new Contexto(new AntivirusNuevo());
		contexto.ejecutar();
	}
}
