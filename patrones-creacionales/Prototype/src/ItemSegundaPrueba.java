
public class ItemSegundaPrueba extends PrototypeItem {
	public ItemSegundaPrueba(String x,String y, String z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}

	@Override
	public PrototypeItem clone() {
		return new ItemSegundaPrueba(this.x, this.z, this.z);
	}
}
