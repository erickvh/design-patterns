
public class Main {

	public static void main(String[] args) {

		Contexto c= new Contexto();
		c.mostrar();
		
		c.setEstado(new EstadoConcretoB());
		c.mostrar();
		c.setEstado(new EstadoConcretoC());
		c.mostrar();
	}

}
