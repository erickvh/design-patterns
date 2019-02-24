
public class AutoFactory extends VehiculoAbstractFactory{
	public final int Lujo=1;
	public final int Familiar=2;
	@Override
	public Vehiculo getVehiculo(int t) {
		// TODO Auto-generated method stub
		switch(t) {
		case Lujo:
			return new CarroLujo();
		case Familiar:
			return new CarroFamiliar();
		}
		return null;
	}
	
}
