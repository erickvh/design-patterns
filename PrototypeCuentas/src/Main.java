import com.docker.implementaciones.CuentaAhorro;

public class Main {
	public static void main(String ...args) {
		CuentaAhorro cuenta= new CuentaAhorro();
		cuenta.setMonto(4512);
		
		CuentaAhorro cuentaClon= (CuentaAhorro) cuenta.clonar();
		if(cuentaClon!=null) {
			System.out.println(cuentaClon);
		}
		
		System.out.println("Cuenta Clonada == Cuenta Original: "+(cuentaClon == cuenta));
		
	}
}
