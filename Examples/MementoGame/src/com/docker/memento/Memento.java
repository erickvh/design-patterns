package com.docker.memento;

public class Memento {
	//mismo estado de juego actua como nodo
	private Game estado;
	public Memento(Game estado) {
		this.estado=estado;
	}
	public Game getEstado() {
		return estado;
	}
	

}
