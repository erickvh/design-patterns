
public class ProxyServer implements Server {
	RealServer realServer;
	private String host;
	
	
	public ProxyServer(String host) {
		this.host=host;
		realServer=null; //debido a que se inicia, se debe setear con null
		System.out.println("Iniciando el proxy...");
		
	}
	
	@Override
	public void download(String url) {
		if(realServer==null) {
			realServer= new RealServer(host);
		}
		realServer.download(url);
	}	

}
