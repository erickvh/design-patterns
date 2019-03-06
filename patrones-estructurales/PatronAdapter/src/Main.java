
public class Main {

	public static void main(String[] args) {
		Item item; //interfaz :)
		/*
		ItemCategoriaA itemA= new ItemCategoriaA();
		ItemCategoriaB itemB= new ItemCategoriaB();
		ItemC itemC = new ItemC();// no tiene los metodos de las demas categorias, si no solo sus uunicos metodos
		ItemCAdapter itemC2= new ItemCAdapter();// correcto pero no se usa polimorfismo
		*/
		
		item=new ItemCategoriaB();
		item.access();
		item= new ItemCategoriaA();
		item.sell();
		item = new ItemCAdapter();
		item.access();
		ItemCAdapter it= new ItemCAdapter();
		it.revisar();
	}

}
