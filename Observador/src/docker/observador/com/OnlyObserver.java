package docker.observador.com;

public class OnlyObserver extends Observador {
	private double valorCambio=3.25;
	
	public OnlyObserver(Subject subject) {
		this.sujeto=subject;
		this.sujeto.agregarObservador(this);
	}
	@Override
	void actualizar() {
		System.out.println("PEN: "+(sujeto.getEstado()*valorCambio));
		
	}

}
