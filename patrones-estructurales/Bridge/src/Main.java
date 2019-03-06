
public class Main {

	public static void main(String[] args) {
		Comportamiento comportamiento= new Repetida();
		
		comportamiento.addItem("Jose");
		comportamiento.addItem("Manuel");		
		comportamiento.addItem("Bero");	
		comportamiento.addItem("Manuel");
		comportamiento.addItem("Jose");
		
		Lista base = new ListaBase();
		Lista enumerada= new ListaEnumerada();
		Lista vineta = new ListaVineta();
		
		base.setComportamiento(comportamiento);
		enumerada.setComportamiento(comportamiento);
		vineta.setComportamiento(comportamiento);
		
		System.out.println("Comportamiento repetidos, representacion base");
		for(int i=0; i< comportamiento.getSize();i++) {
			System.out.println(base.getItem(i));
		}

		System.out.println("Comportamiento repetidos, representacion enumerado");
		for(int i=0; i< comportamiento.getSize();i++) 
		{
			System.out.println(enumerada.getItem(i));
		}
		
		System.out.println("Comportamiento repetidos, representacion viñeta");
		for(int i=0; i< comportamiento.getSize();i++) 
		{
			System.out.println(vineta.getItem(i));
		}
		
		
		Comportamiento cp= new Unica();
		
		cp.addItem("Jose");
		cp.addItem("Manuel");		
		cp.addItem("Bero");	
		cp.addItem("Manuel");
		cp.addItem("Jose"); // no sera agregado
		
		Lista enume= new ListaEnumerada();
		enume.setComportamiento(cp);
		
		System.out.println("Comportamiento unicos, representacion enumerado");
		for(int i=0; i< cp.getSize();i++) 
		{
			System.out.println(enume.getItem(i));
		}
		

	}
}
