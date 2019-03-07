
public class Email implements Observador{

	@Override
	public void notificar(String m) {
		System.out.println("Estoy notificando con Email "+m);
		
	}

}
