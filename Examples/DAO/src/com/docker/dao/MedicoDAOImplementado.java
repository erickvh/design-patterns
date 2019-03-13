package com.docker.dao;

import java.util.ArrayList;
import java.util.List;

import com.docker.model.Medico;

public class MedicoDAOImplementado implements MedicoDAO{

	@Override
	public List<Medico> listarTodos() {
		Medico m1,m2;
		List<Medico> list= new ArrayList<Medico>();
		
		m1= new Medico();
		m1.setId(1);
		m1.setNombre("Dr. Mario");
		list.add(m1);
		
		m2= new Medico();
		m2.setId(2);
		m2.setNombre("Dr. Erick Ventura");
		list.add(m2);
		

		return list;

	}

	@Override
	public Medico leerPorID(int id) {
		return null;
	}

	@Override
	public void registrar(Medico generico) {
		System.out.println("Se registro medico "+generico.getNombre());
	}

	@Override
	public void actualizar(Medico generico) {
		System.out.println("Se actualizo medico "+generico.getNombre());
		
	}

	@Override
	public void eliminar(int id) {
		System.out.println("Se elimino medico con id:  "+id);

	}

	@Override
	public void recetar() {
		System.out.println("Receto paracetamol");
	}

	@Override
	public void citar() {
		System.out.println("Cito dentro de 20 años");
	}

}
