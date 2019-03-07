import java.util.ArrayList;

public class Number {
	public ArrayList<Integer> numeros= new ArrayList<Integer>();
	
	public void add(int i) {
		numeros.add(i);
	}
	
	public IteradorNumeros getIterador() {
		return new IteradorNumeros(this);
	}
}
