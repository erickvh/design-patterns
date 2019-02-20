//producto concreto
public class ItemPrueba extends PrototypeItem{
	
	public ItemPrueba(String x,String y, String z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	@Override
	public PrototypeItem clone() {
		return new ItemPrueba(this.x, this.y, this.z);
	}
	
	

}
