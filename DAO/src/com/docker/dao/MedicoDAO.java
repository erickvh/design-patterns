package com.docker.dao;

import com.docker.model.Medico;

public interface MedicoDAO extends CRUD<Medico>{
	void recetar();
	void citar();
}
