package com.docker.di;

public class Barcelona implements EquipoInterface{
	private String nombre="Barcelona";
	private int copas=10;
	
	@Override
	public void mostrarNombre() {
		System.out.println("El nombre del equipo es "+this.nombre);
	}

	@Override
	public void mostrarCopas() {
		System.out.println("Cantidad de copas: "+this.copas);
	}

}
