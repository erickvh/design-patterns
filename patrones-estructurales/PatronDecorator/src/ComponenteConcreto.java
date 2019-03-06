
public class ComponenteConcreto  implements Component{
	
	private int valor=10;
	
	 public ComponenteConcreto(int valor) {
		 this.valor=valor;
	 }
	@Override
	public void methodA() {
		System.out.println("Metodo A, componente concreto ");
	}

	@Override
	public void methodB() {
		System.out.println("Metodo B, componente concreto ");		
	}

	@Override
	public void methodC() {
		System.out.println("Metodo C, componente concreto ");		
	}

	@Override
	public int getValor() {
		return this.valor;
	}

}
