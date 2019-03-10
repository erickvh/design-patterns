package docker.observador.com;

public class TwiceObserver extends Observador{

private double valorCambio=6.5;
	
	public TwiceObserver(Subject subject) {
		this.sujeto=subject;
		this.sujeto.agregarObservador(this);
	}
	@Override
	void actualizar() {
		System.out.println("TWICE: "+(sujeto.getEstado()*valorCambio));
	}	
	
}
