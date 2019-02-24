
public class Main {

	public static void main(String[] args) {
	/*	
		ObjetoCualquiera obj1= new ObjetoCualquiera("A");
		ObjetoCualquiera obj2= new ObjetoCualquiera("B");
		
		System.out.println(obj1.getX());
		System.out.println(obj2.getX());		
	*/
		
	
	//metodo estatico de java, permite entrar al constructor privado y crear una sola instancia
	
		SingletonObj obj1= SingletonObj.getSingletonObj("A");
		
		SingletonObj obj2= SingletonObj.getSingletonObj("B");
		
		//Demuestra que solo se ejecuta un solo objeto
		System.out.println(obj1.getX());
		System.out.println(obj2.getX());
	}
	

}
