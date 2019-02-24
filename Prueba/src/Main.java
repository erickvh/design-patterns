
public class Main {

	public static void main(String[] args) {
		Hijo hijo= new Hijo();
		hijo.biciar();
		hijo.comer();
		//polimorfismo
		Padre hijo2 = new Hijo();
		hijo2.comer();
		//hijo2.biciar(); //no funciona
	}

}
