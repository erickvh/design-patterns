
public class Contexto {
	private Estado estado;
	
	public Contexto() {
		this.estado= new EstadoConcretoA();
	}
	
	public void setEstado(Estado estado) {
		this.estado=estado;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void mostrar() {
		estado.mostrar();
	}
}
