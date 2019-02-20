
public class MotocicletaFactory extends VehiculoAbstractFactory{
	public final int Clasica =1;
	public final int  Ninja= 2;
	@Override
	public Vehiculo getVehiculo(int t) {

		switch(t) {
		case Clasica:
			return new MotoClasica();
		case Ninja:
			return new MotoNinja();
		}
		return null;
	
	}
	
}
