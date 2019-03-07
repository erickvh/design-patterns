
public class Asesor implements Autorizador{
	Autorizador sucesor;
	
	public void setSucesor(Autorizador s) {
		this.sucesor=s;
	}

	@Override
	public void autorizar(int num) {
		if(num<=2000)
		{
			System.out.println("Asesor autoriza, "+num);
		}
		else
		{
			sucesor.autorizar(num);
		}
	}
}
