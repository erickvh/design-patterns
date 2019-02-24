
public class ItemCategoriaA extends Item {
	
	public ItemCategoriaA() {
		super();
		System.out.println("Item de la categoria A");
	}
	@Override
	public void sell() {
		System.out.println("Se vendio el producto categoria A");
	}

	@Override
	public void access() {
		System.out.println("Se accedio al producto categoria A");
	}

	@Override
	public void send() {
		System.out.println("Se envio item A");
	}

}
