package com.docker.memento;
//conoce maneras de guardar y restaurar memento vs estado
public class Originator {
	//contiene el juego como estado
	private Game estado;

	public Game getEstado() {
		return estado;
	}

	public void setEstado(Game estado) {
		this.estado = estado;
	}
	
	//da el memento o nodo
	public Memento guardar() {
		return new Memento(estado);
	}
	
	public  void restaurar(Memento m) {
			this.estado= m.getEstado();
	}
}
