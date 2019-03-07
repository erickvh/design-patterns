

public class Main {
	public static void main(String ...args) {
		Number numero= new Number();
		numero.add(2);
		numero.add(3);
		numero.add(4);
		numero.add(255);
		numero.add(26);
		numero.add(21);
		numero.add(33);
		numero.add(44);
		numero.add(122);
		numero.add(56);
		numero.add(21);
		
		IteradorNumeros it= numero.getIterador(); //se obtiene el iterador de numeros
		
		it.primero();
		while(it.tieneMas()) {
			System.out.println(it.Siguiente());
		}
		
		Word palabra= new Word();
		
		palabra.set(0, "Tiro");
		palabra.set(1, "Al");
		palabra.set(2, "Blanco");
		palabra.set(3, "etc.");
		
		IteradorWord itw= palabra.getIterador();
		itw.primero();
		
		while(itw.tieneMas()) {
			System.out.println(itw.Siguiente());
		}
		
		

	}
}
