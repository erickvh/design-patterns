import java.util.ArrayList;
import java.util.List;


public class Builder {
	List<Integer> acciones;
	//polimorfismo sobre la interfaz
	Robot robot;
	
	//contrusctor que inicializa las acciones vacias
	public Builder() {
		this.acciones= new ArrayList<Integer>();
	}
	
	//metodo que crea robot dependiendo de lo que solicite el cliente
	public void setRobot(int i) {
		if(i==1) {
			this.robot=new RobotHamburguesa();
		}
		else {
			this.robot=new RobotHotDog();			
		}
	}
	
	/*
	 * Metodos que puede solicitar el cliente
	 */
	
	public void addGetIngredientes() {
		this.acciones.add(1);
	}
	
	public void addArmar() {
		this.acciones.add(2);
	}	
	
	public void addRevisar() {
		this.acciones.add(3);
	}
	
	public void addNoDefinido() {
		this.acciones.add(200);
	}
	
	//devuelve el robot creado con las acciones adjuntas
	public Robot getRobot() {
		robot.cargarAcciones(acciones);
		return robot;
	}
}
