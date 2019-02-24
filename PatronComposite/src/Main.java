
public class Main {
 
	public static void main(String ...args) {
		create();

	}
	

	public static void create() {
		Project mercado = new Project("compra de comida");
		SubProject plaza= new SubProject("Plaza de mercado");
		SubProject supermercado= new SubProject("Supermercado");
		SubProject carniceria= new SubProject("Carniceria");
		
		addPlaza(plaza);
		mercado.addItemProject(plaza);
		//mercado.imprimir();
		addSuper(supermercado);
		mercado.addItemProject(supermercado);
		//mercado.imprimir();
		addCarniceria(carniceria);
		mercado.addItemProject(carniceria);
		
		mercado.imprimir();
		
	}

	private static void addCarniceria(SubProject carniceria) {
		ToDO res = new ToDO("Carne Res","Juana");
		ToDO pollo= new ToDO("Pollo desmenuzado","Juana");
		
		carniceria.addItemProject(res);
		carniceria.addItemProject(pollo);		
	}

	private static void addPlaza(SubProject plaza) {
		ToDO papa= new ToDO("papa", "pedro");
		ToDO cebolla= new ToDO("cebolla", "juan");
		ToDO tomate= new ToDO("tomate", "pedro");
		plaza.addItemProject(papa);
		plaza.addItemProject(tomate);
		plaza.addItemProject(tomate);
	}

	private static void addSuper(SubProject supermercado) {
		ToDO salad= new ToDO("Ensalada francesa", "pedro");
		ToDO pizza= new ToDO("Italian Pizza", "juan");
		supermercado.addItemProject(pizza);
		supermercado.addItemProject(salad);
	
	}
}
