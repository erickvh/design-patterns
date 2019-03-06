
public class Originator {
	private String state;
	
	public void setState(String state) {
		this.state= state;
		
	}
	
	public Memento save() {
		return new Memento(state);
		
	}
	
	public Memento restore() {
		return new Memento(state);
		
	}
}
