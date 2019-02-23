import java.util.List;

public class RobotHotDog implements Robot{
	
	List<Integer> acciones;
	
	public RobotHotDog() {}

	
	private void comenzar() {
		System.out.println("Se comienza a prepar un hotdog");
	}
	
	private void getIngredientes() {
		System.out.println("Se obtienen: el pan, la salchicha, mostaza, mayonesa");
	}
	
	private void armar() {
		System.out.println("Se arma el hotdog");
	}
	
	private void checkear() {
		
		System.out.println("Revisar si todo esta en orden");
	}
	
	private void terminar() {
		System.out.println("Termino el hotdog rico");
	}
	
	
	@Override
	public void trabajar() {
		this.comenzar();
		for(Integer accion: acciones) {
			switch(accion) {
			case 1:
				this.getIngredientes();
				break;
			case 2:
				this.armar();
				break;
			case 3:
				this.checkear();
				break;
			default:
				System.out.println("Metodo no definido en robot salchicha");
				
			}
			
		}
		this.terminar();
	}

	@Override
	public void cargarAcciones(List<Integer> acciones) {
		
		this.acciones= acciones;
	}
}
