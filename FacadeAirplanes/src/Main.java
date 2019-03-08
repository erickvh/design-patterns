import com.docker.fachada.RevisarFachada;

public class Main {
	public static void main(String ...args) {
		RevisarFachada fachada= new RevisarFachada();
		fachada.buscar("San Salvador", 2011);
		fachada.buscar("San Vicente",2100);
	}
}
