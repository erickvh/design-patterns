package com.docker.di;

public class Jugador {
	private EquipoInterface eq;
	private String nombre;
	private int edad;
	
//	private EquipoInterface equipo= new Barcelona(); //evitar esto
	public Jugador() {
	
	}
	//constructor inyection
	public Jugador(EquipoInterface eq) {
		this.eq=eq;
	}
	
	//brinda por method inyection
	public void setEq(EquipoInterface eq) {
		this.eq = eq;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void info() {
		System.out.println("Jugador: "+nombre);
		System.out.println("Edad: "+edad);
		eq.mostrarNombre();
		eq.mostrarCopas();
	}
	
	public void vivir() {
		if(eq instanceof RealMadrid){
			RealMadrid real= (RealMadrid) eq;
			real.vivirEnMadrid();
		}
		else
		{
			System.out.println("METODO NO EXISTE");
		}
}
}