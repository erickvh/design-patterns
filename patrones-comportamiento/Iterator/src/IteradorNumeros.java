
public class IteradorNumeros implements Iterador{
	Number numero;
	Integer position;
	
	 public IteradorNumeros(Number num) {
		 this.numero= num;
	 }
	@Override
	public void primero() {
		this.position=0;
		
	}

	@Override
	public Object Siguiente() {
		int r= numero.numeros.get(position);
		
		this.position++;
		return r;
	}

	@Override
	public boolean tieneMas() {
		if(this.position<numero.numeros.size())
			return true;
		else
			return false;
	}

}
