
public class Word {
	public String word1,word2,word3,word4;
	
	public void set(int i,String word) {
		switch(i) {
		case 0:
			this.word1= word;
			break;
		case 1:
			this.word2= word;
			break;
		case 2: 
			this.word3= word;
			break;
		case 3: 
			this.word4= word;
			break;
		default:
			System.out.println("no definido");
		}
	}
	
	public IteradorWord getIterador() {
		return new IteradorWord(this);
	}
}
