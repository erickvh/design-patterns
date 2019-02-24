
public class ListaBase extends Lista{
	@Override
	public String getItem(int i) {
		if(i<super.getSize()) 
			return super.getItem(i);
		return "";
		
	}
}
