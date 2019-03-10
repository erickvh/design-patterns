package com.docker;

import com.docker.memento.CareTaker;
import com.docker.memento.Game;
import com.docker.memento.Originator;

public class Main {

	public static void main(String[] args) {
		Game mario= new Game();
		mario.setName("Mario Bross. 2");
		mario.setCheckpoint(1);
		// se declaran los pilares
		CareTaker caretake = new CareTaker();
		Originator originator = new Originator();
		
		//se salva el estado
		originator.setEstado(mario);
		//originator.guardar() retorna memento, caretaker.addMemento lo agrega en su array dinamico
		
		caretake.addMemento(originator.guardar()); //adicionando a la lista de mementos , pos 0
		
		mario= new Game();
		mario.setName("Mario Bross. 2");
		mario.setCheckpoint(2);
		mario.setCheckpoint(4);
		
		
		originator.setEstado(mario);
		caretake.addMemento(originator.guardar()); // posicion 1
		
		mario= new Game();
		mario.setName("Mario Bross. 2");
		mario.setCheckpoint(20);
		caretake.addMemento(originator.guardar()); // posicion 2
		
		
		System.out.println("Estado actual: "+originator.getEstado());
		
		//se restaura el memento seteando el estado, en el restaurar como el estado
		originator.restaurar(caretake.getMemento(0));
		Game check= originator.getEstado();
		System.out.println("Recuperando posicion 0: "+check);
		
		originator.restaurar(caretake.getMemento(1));
		check= originator.getEstado();
		System.out.println("Recuperando pos 1: "+check);
		
	}

}
