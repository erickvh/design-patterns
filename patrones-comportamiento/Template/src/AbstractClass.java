
public  abstract class AbstractClass {
	
	public int getNum(int num)
	{
		this.mostrar();
		int n= this.sumar(num);
		n= this.multiplicar(num);
		
		return n;
	}	
	public void mostrar() {
		System.out.println("Iniciando algoritmo");
	}
	public abstract int sumar(int n);
	public abstract int multiplicar(int n);
	
}
