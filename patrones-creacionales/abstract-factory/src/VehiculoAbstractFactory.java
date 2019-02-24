
public abstract class VehiculoAbstractFactory {
	public static final int AutoFactory=1;
	public static final int MotocicletaFactory=2;
	
	public abstract Vehiculo getVehiculo(int t);
	
	public static VehiculoAbstractFactory getFactory(int tipo)
	{
		switch(tipo) {
		case AutoFactory:
			return new AutoFactory();
		case MotocicletaFactory:
			return new MotocicletaFactory();
		
		}
		return null;
	}
	
}
