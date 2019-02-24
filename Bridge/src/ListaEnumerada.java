
public class ListaEnumerada extends Lista{
	/*
		Se implementa de la lista el metodo get Item que a su vez encapsula el 
		comportamiento al interior de el
	 */
	@Override
	public String getItem(int i) {
		if(i<super.getSize()) 
			return (i+1)+". "+super.getItem(i);
		return "";
		
	}
}
