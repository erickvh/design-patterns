import java.util.List;

public interface Robot {
	
	//pone a trabajar un robot en algo
	public void trabajar();
	
	//metodo para cargar las acciones delegadas en tiempo de ejecucion
	public void cargarAcciones(List<Integer> acciones);
} 
