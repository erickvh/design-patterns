
public class Main {
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		FacadeImpresor fachada = new FacadeImpresor();
		boolean faltaTinta=true;
		
		if(faltaTinta) {
			fachada.faltaTinta();
		}
		else {
			fachada.imprimir();
				
		}
	}


}
