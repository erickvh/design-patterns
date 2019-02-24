
public class RealServer implements Server {
	private String host;
	
	 public RealServer(String host) {
		 this.host=host;
		 System.out.println("iniciando");
	 }	
	@Override
	public void download(String url) {

		System.out.println("Decargando del host: "+this.host+url);
	}

}
