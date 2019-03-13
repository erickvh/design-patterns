package com.docker;

import com.docker.dao.CRUD;
import com.docker.dao.MedicoDAOImplementado;
import com.docker.dao.PersonaDAOImplementado;
import com.docker.model.Medico;
import com.docker.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		//abstracion por desacoplamiento por la interfaz
//		PersonaDAO per= new PersonaDAOImplementado();
		CRUD<Persona> per = new PersonaDAOImplementado();
		System.out.println("DAO DE PERSONA");
		per.listarTodos().forEach(x-> System.out.println(x.getNombre()));
		per.eliminar(2);
		Persona persona= new Persona();
		persona.setId(34);
		persona.setNombre("Carlos Guevara");
		per.registrar(persona);
		
		System.out.println("DAO DE MEDICO");
		CRUD<Medico> med= new MedicoDAOImplementado();
		med.listarTodos().forEach(x->System.out.println("Medico "+x.getNombre()));;
		med.eliminar(2);
		//med.citar(); //no hay acceso debido a que el acomplamiento solo cubre operaciones crud
		MedicoDAOImplementado med2= (MedicoDAOImplementado) med;
		med2.citar();
		}

}
