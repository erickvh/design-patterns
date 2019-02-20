import java.sql.Connection;
//producto concreto
public class PgsqlAdaptador implements AdaptadorBD{

	@Override
	public String toString() {
		return "PgsqlAdaptador [getConnection()=" + getConnection() + "]";
	}

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		Connection conexion= null;
		return conexion;
	}

}
