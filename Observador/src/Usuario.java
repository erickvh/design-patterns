import java.util.ArrayList;

public class Usuario implements Sujeto {
	private ArrayList<Observador> observadores= new ArrayList<Observador>();
	private  String nombre;
	
	@Override
	public void addObservador(Observador obs) {
		observadores.add(obs);
	}

	public void setName(String name) {
		this.nombre=name;
		this.notificarObservadores();
	}
	@Override
	public void notificarObservadores() {
		for(Observador ob : observadores) {
			ob.notificar("Usuario =>"+nombre);
		}
	}

}
