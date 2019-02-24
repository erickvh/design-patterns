import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//cliente
		ItemPrueba prueba = new ItemPrueba("bd:3451", "root", "231212xas");
		ArrayList items= new ArrayList();
		
		for(int x=0; x<10;x++) {
			PrototypeItem item=prueba.clone();
			prueba.setX(prueba.getX()+String.valueOf(x));
			items.add(item);		
			
		}
		
		for (int x=0;x<10;x++) {
			System.out.println(items.get(x));
			PrototypeItem p= (PrototypeItem) items.get(x);
			System.out.println(p.getX());
		}
	}

}
