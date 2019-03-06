
public class ItemCAdapter extends Item {
	
	private ItemC itemC;

	
	public void revisar() {
		this.itemC.revisar();
	}

	public ItemCAdapter() {
		this.itemC= new ItemC();
	}
	@Override
	public void sell() {
		this.itemC.revisar();
	}

	@Override
	public void access() {
		this.itemC.revisar();		
	}

	@Override
	public void send() {
		this.itemC.revisar();
		this.itemC.borrar();
		
	}
	
	
}
