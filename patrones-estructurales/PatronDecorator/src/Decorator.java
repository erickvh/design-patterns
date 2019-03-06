//clase abstracta permite no escribir sus metodos abstractos de la implementacion
public abstract class Decorator implements Component{

	private Component componente;
	
	public Decorator(Component componente) {
		this.componente=componente;
		
	}
	//retornar componente
	public Component getComponente() {
		return componente;
	}
}
