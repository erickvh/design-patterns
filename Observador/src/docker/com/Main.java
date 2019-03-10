package docker.com;

import docker.observador.com.OnlyObserver;
import docker.observador.com.Subject;
import docker.observador.com.TwiceObserver;

public class Main {

	public static void main(String[] args) {
		Subject sujeto= new Subject();
		new OnlyObserver(sujeto);
		new TwiceObserver(sujeto);
		
		System.out.println("Cambiando 10");
		sujeto.setEstado(10);
		System.out.println("cambiando 20");
		sujeto.setEstado(20);
	}

}
