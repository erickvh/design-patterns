package com.docker.memento;

import java.util.ArrayList;

public class CareTaker {
	//adiciona los memetos que son nods de estado juego
	private ArrayList<Memento> mementos = new ArrayList<Memento>();
	//agrega nodo
	public void addMemento(Memento m) {
		mementos.add(m);
	}
	
	//recupera nodo
	public Memento getMemento(int id) {
		return mementos.get(id);
	}

	
}
