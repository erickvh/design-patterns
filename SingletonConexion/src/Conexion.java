
public class Conexion {
	private static Conexion instancia;
	
	//evitara usar el constructor
	private Conexion() {
		
	}
	
	public static Conexion getInstancia() {
		if (instancia==null)
			return new Conexion();
		return instancia;		
	}
	
	
	public void conectar() {
		System.out.println("Conexion de bd");	
	}
	
	public void desconectar() {
		System.out.println("Desconexion de bd");
	}
}
