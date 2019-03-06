
public class Main {

	public static void main(String[] args) {
		Server server= new ProxyServer("site.net/"); // se tiene en class proxyserver server=null;
		server.download("lo-que-sea");// se crea el objeto internamente server real, y ejecuto su metodo desde este metodo,
		// se cubre el acceso al objeto puro
		
		
	}

}
