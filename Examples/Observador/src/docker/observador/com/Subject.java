package docker.observador.com;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observador> observers = new ArrayList<Observador>();
	private int estado;
	
	public int getEstado() {
		return estado;

	}
	public void setEstado(int estado) {
		this.estado = estado;
		notificarTodos();
	}
	public void agregarObservador(Observador obs) {
		this.observers.add(obs);
	}
	public void notificarTodos() {
		for (Observador observador : observers) {
			observador.actualizar();
		}
	}
	
}
