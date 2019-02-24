
public class FacadeImpresor {
	ObjectA a;
	ObjectC c;
	ObjectB	b;
	
	public  void imprimir() {
		a= new ObjectA();
		b= new ObjectB();
		c= new ObjectC();
		
		a.CapturarDatos();
		b.conocerColor();
		c.CargarHoja();
		c.Imprimir();
	}
	
	public void faltaTinta() {
		a= new ObjectA();
		b= new ObjectB();
		c= new ObjectC();
		
		a.mostrarAdvertencia();
		b.apagarCarroTinta();
		c.ExpulsarHoja();
		
		
	}
	
	
}
