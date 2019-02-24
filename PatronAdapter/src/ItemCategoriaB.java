
public class ItemCategoriaB  extends Item{
	public ItemCategoriaB() {
		super();
		System.out.println("Item B");
	}

	@Override
	public void sell() {
		System.out.println("Se vendio el producto categoria B");
	}

	@Override
	public void access() {
		System.out.println("Se accedio al producto categoria B");
	}

	@Override
	public void send() {
		System.out.println("Se envio item B");
	}
}
