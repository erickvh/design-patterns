import java.util.Scanner;

public class Main {
 
	public static void main(String... args) {
		
		Builder constructor= new Builder(); //internamente crea las acciones vacias
		Robot robot;
		int tipoRobot;
		
		Scanner lectura= new Scanner(System.in);
		System.out.println("Ingrese el tipo de robot que desea\n1.RobotHamburguesa\n2.Robot Hotdog");
		tipoRobot=lectura.nextInt();
		
		constructor.setRobot(tipoRobot);// se setea el tipo de robot internamente Robot queda con el tipo por el polimorfismo
		
		//haciendo append de las acciones al robot
		constructor.addRevisar();
		constructor.addNoDefinido();
		constructor.addGetIngredientes();
		constructor.addArmar();
		constructor.addRevisar();
		
		robot = constructor.getRobot(); //robot ya construido
		robot.trabajar(); // robot listo para ejecutar
	}
}
