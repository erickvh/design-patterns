
public class FactoryBD {
	//creador y creador concreto
	public enum BDtipo{MySQL,Oracle,Pgsql};

	public  static AdaptadorBD getAdapter(BDtipo bdTipo) { //return de la interfaz implementada
		
		switch(bdTipo) {
		case MySQL:
			return new MySQLAdaptador();//cada producto concreto lo implementa
		
		case Oracle:
			return new OracleAdaptador();
		
		case Pgsql:
			return new PgsqlAdaptador();
			
		default:
			throw new IllegalArgumentException("NO EXISTE");
		}
	
	}
	
	
}
