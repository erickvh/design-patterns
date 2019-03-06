
public class Main {
	
	public static void main(String ...args)
	{
		// crear observadores
		Observador slack = new Slack();
		Observador email= new Email();
		
		//crear un sujeto concreto
		Cliente cliente= new Cliente();
		//agregar observadores
		cliente.addObservador(slack);	
		cliente.addObservador(email);
		//doble notificacion de slack tambien email
		cliente.setName("Ricardo Martinez");
		cliente.setName("Ricardo Perez"); 
		
		//usuario solo notificado por slack
		Usuario user= new Usuario();
		user.addObservador(email); //solo por email
		user.setName("Usuario anonimo");
		user.setName("Erick Ventura");
	}

	
}
