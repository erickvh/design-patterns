
public class Main {

	public static void main(String[] args) {
		//diferentes interpretaciones de un algoritmo a un mismo comportamiento
		AbstractClass casoA= new CasoConcretoA();
		
		AbstractClass casoB= new CasoConcretoB();
		
		/**
		 * int n= casoA.sumar(2);
		 * int x= casoA.multiplicar(n);
		 * system.out.println(x); // mismo algoritmo se puede volver grande
		 */
		
		int n=casoA.getNum(2);
		System.out.println(n);
		int a=casoB.getNum(20);
		System.out.println(a);
	}
}
