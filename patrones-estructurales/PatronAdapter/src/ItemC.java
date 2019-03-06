// no abstrae la clase abstracta debido a que necesita un comportamiento unico
// pero se necesito el mismo, instanciamiento en la estructura
public class ItemC {
	public ItemC() {
		super();
		System.out.println("Item C");
	}
	
	public void revisar() {
		System.out.println("Item C revisado");
	}
	
	public void borrar() {
		System.out.println("Item C borrar");
	}
}
