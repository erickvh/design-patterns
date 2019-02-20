import java.sql.Connection;

public class Main {

	public static void main(String[] args) {

		AdaptadorBD dbmysql=FactoryBD.getAdapter(FactoryBD.BDtipo.MySQL);	
		Connection conexionMysql=dbmysql.getConnection();
		AdaptadorBD dbpgsql=FactoryBD.getAdapter(FactoryBD.BDtipo.Pgsql);	
		Connection conexionPgsql=dbpgsql.getConnection();
		
		System.out.println(dbmysql.toString());
		System.out.println(dbpgsql.toString());
	}

}
