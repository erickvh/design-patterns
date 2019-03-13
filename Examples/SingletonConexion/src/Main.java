
public class Main {
 public static void main(String ...args) {
	 Conexion conexion=Conexion.getInstancia();
	 conexion.conectar();
	 conexion.desconectar();
	 boolean esConexion= conexion instanceof Conexion;
	 System.out.println("La variable conexion es instacia de conexion: "+(esConexion?"Si":"No"));
	 
 }
}
