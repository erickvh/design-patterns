import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Cual fabrica usara? \n1 -> Autofactory\n2 -> MotoFactory");
		int tipoAbstracto= entrada.nextInt();

		//se obtiene fabrica atravez del metodo estatico 
		VehiculoAbstractFactory fabricaAbstracta= VehiculoAbstractFactory.getFactory(tipoAbstracto); 

		System.out.println("Seleccione un tipo de vehiculo (1,2):  ");
		int tipoVehiculo=entrada.nextInt();
		
		//de la fabrica abstracta se obtiene el tipo de vehiculo por medio de la interfaz implementada
		Vehiculo vehiculo= fabricaAbstracta.getVehiculo(tipoVehiculo);
	
		System.out.println("Asientos "+vehiculo.getSeats());
		System.out.println("Llantas "+vehiculo.getWheels());
		
		
	}

}
