import java.sql.Connection;
//producto concreto
public class MySQLAdaptador implements AdaptadorBD{

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		Connection conexion=null;
		return conexion;
	}

	@Override
	public String toString() {
		return "MySQLAdaptador [getConnection()=" + getConnection() + "]";
	}
	
}
