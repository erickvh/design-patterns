import java.util.List;

public class RobotHamburguesa implements Robot{
	List<Integer> acciones;
	
	public RobotHamburguesa() {}
		
	private void iniciar() {
		System.out.println("Iniciando la preparacion de una hamburguesa");
	}
	
	private  void getIngredientes() {
		System.out.println("Los ingredientes son: pan, carne, salsa, tomates, lechuga");
	}
	
	private void armar() {
		System.out.println("Armando la hamburguesa");
	}
	private void revisar() {
		System.out.println("revisando la calidad de la hamburguesa");
	}
	
	private void terminar() {
		System.out.println("Proceso terminado con exito");
	}
	
	@Override
	public void cargarAcciones(List<Integer> acciones) {

		this.acciones=acciones;
	}
	
	@Override
	public void trabajar() {
		
		iniciar();
		for(Integer accion : this.acciones) {
			switch(accion) {
				case 1:
					this.getIngredientes();
					break;
				case 2:
					this.armar();
					break;
				case 3:
					this.revisar();
					break;
				default:
					System.out.println("Esta accion no esta definida en el robot hamburgusa");
			}
		}
		this.terminar();
	}

	
}
