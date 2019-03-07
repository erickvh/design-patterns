import java.util.Scanner;

public class Main {
	public static void main(String ...args) {
		Asesor asesor= new Asesor();
		Coordinador coordinador= new Coordinador();
		Gerente gerente = new Gerente();
		
		asesor.setSucesor(coordinador);
		coordinador.setSucesor(gerente);
		
		Scanner sc= new Scanner(System.in);
		
		int valor;
		System.out.println("Ingrese dinero: ");
		valor = sc.nextInt();
		
		asesor.autorizar(valor);
	}
}
