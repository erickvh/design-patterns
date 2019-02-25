//metodos abstracto + metodos de la interfaz componente
public class DecoratorConcrete extends Decorator{

	public DecoratorConcrete(Component componente) {
		super(componente);//setea el componente del metodo abstracto
	}

	@Override
	public void methodA() {
		getComponente().methodA();
		System.out.println("Metodo A, decorador concreto");
	}

	@Override
	public void methodB() {
		getComponente().methodB();		
		System.out.println("Metodo B, decorador concreto");
	}

	@Override
	public void methodC() {
		getComponente().methodC();	
		System.out.println("Metodo C, decorador concreto");
	}

	@Override
	public int getValor() {
		// TODO Auto-generated method stub
		return this.getValor();
	}

}
