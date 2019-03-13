package com.docker;

import com.docker.di.Barcelona;
import com.docker.di.Jugador;
import com.docker.di.RealMadrid;

public class Main {

	public static void main(String ...args) {
		Jugador jara= new Jugador(new Barcelona());
		jara.info();
		
		jara.setEdad(22);
		jara.setNombre("Jara Jas jas");
		jara.info();
		jara.vivir();
		
		jara.setEq(new RealMadrid()); //cambio a real madrid
		jara.info();
		jara.vivir();
	}
}
