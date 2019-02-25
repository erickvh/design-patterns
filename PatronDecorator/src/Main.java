
public class Main {

	public static void main(String[] args) {
		//habitual
		Component componente= new ComponenteConcreto(1);
		
		componente= new DecoratorConcrete(componente); //extiende esta funcionalidad decorando el componente
		componente= new DecoratorConcreteB(componente);	
		componente.methodA();
		componente.methodB();
		componente.methodC();
	}

}
