//el comportamiento de sujetos
public interface Sujeto {
	void addObservador(Observador obs);
	void notificarObservadores();
}
