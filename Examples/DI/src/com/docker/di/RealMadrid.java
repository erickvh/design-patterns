package com.docker.di;

public class RealMadrid implements EquipoInterface{
	private String nombre="MADRID FC";
	private int copas=2;
	@Override
	public void mostrarNombre() {
		System.out.println("Nombre equipo: "+this.nombre);
	}

	@Override
	public void mostrarCopas() {
		System.out.println("Copas: "+this.copas);
	
	}
	
	public void vivirEnMadrid() {
		System.out.println("Vivimos en Madrid");
	}
	
}
