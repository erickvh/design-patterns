package com.docker.dao;

import java.util.ArrayList;
import java.util.List;

import com.docker.model.Persona;

public class PersonaDAOImplementado implements PersonaDAO{

	@Override
	public List<Persona> listarTodos() {
		Persona p1,p2,p3;
		List<Persona> list= new ArrayList<Persona>();
		
		p1= new Persona();
		p1.setId(1);
		p1.setNombre("Juan Carlos");
		list.add(p1);
		
		p2= new Persona();
		p2.setId(2);
		p2.setNombre("Erick Ventura");
		list.add(p2);
		
		p3= new Persona();
		p3.setId(1);
		p3.setNombre("Zajas amid");
		list.add(p3);
		
		return list;
	}

	@Override
	public Persona leerPorID(int id) {
		return null;
	}

	@Override
	public void registrar(Persona p) {
		System.out.println("Perso"
				+ "na ingresada: "+p.getNombre());
	
	}

	@Override
	public void actualizar(Persona p) {
		System.out.println("Persona actualizada: "+p.getNombre());
			
	}

	@Override
	public void eliminar(int id) {
		System.out.println("Persona eliminada con "+id);
	}

}
