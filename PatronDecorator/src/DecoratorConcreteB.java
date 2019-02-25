
public class DecoratorConcreteB  extends Decorator{

	public DecoratorConcreteB(Component componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void methodA() {
		getComponente().methodA();
		System.out.println("Metodo A, Decorador B");
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		getComponente().methodB();
		System.out.println("Metodo B, Decorador B");
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		getComponente().methodC();
		System.out.println("Metodo C, Decorador B");
	}

	@Override
	public int getValor() {
		// TODO Auto-generated method stub
		return this.getValor();
	}

}
