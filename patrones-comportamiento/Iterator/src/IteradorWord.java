
public class IteradorWord implements Iterador {
	Word palabra;
	int position;
	
	public IteradorWord(Word palabra) {
		this.palabra=palabra;
	}

	@Override
	public void primero() {
		this.position=0;
	}

	@Override
	public Object Siguiente() {
		switch(this.position) {
			case 0:
				this.position++;
				return palabra.word1;
			case 1:
				this.position++;
				return palabra.word2;
			case 2:
				this.position++;
				return palabra.word3;
			case 3:
				this.position++;
				return palabra.word4;
			default: 
				System.out.println("no existe");
				return  null;
		}

	}

	@Override
	public boolean tieneMas() {
		if(this.position<=3) {
			return true;
		}
		return false;
	}
}
