import java.util.ArrayList;

public class CareTaker {
	private ArrayList<Memento> mementos= new ArrayList<Memento>();
	
	public void addMemento(Memento memento) {
		mementos.add(memento);
	}
	
	public Memento getMemento(int p) {
		return mementos.get(p);
	}
}
