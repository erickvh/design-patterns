
public class Slack  implements Observador{

	@Override
	public void notificar(String m) {
		System.out.println("Notificando por canal de comunicacion en slack: "+m);
	}

}
