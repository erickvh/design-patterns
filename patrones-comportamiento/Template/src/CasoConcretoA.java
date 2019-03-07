
public class CasoConcretoA extends AbstractClass {

	public CasoConcretoA() {
		System.out.println("Metodo concreto A");
	}
	
	@Override
	public int sumar(int n) {
		
		return n+2;
	}

	@Override
	public int multiplicar(int n) {

		return n*0;
	}

}
