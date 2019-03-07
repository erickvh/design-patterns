
public class Coordinador implements Autorizador{
	Autorizador sucesor;
	
	public void setSucesor(Autorizador s) {
		this.sucesor=s;
	}

	@Override
	public void autorizar(int num) {
		if(num<=10000)
		{
			System.out.println("coordinador autoriza, "+num);
		}
		else
		{
			sucesor.autorizar(num);
		}
	}
}
