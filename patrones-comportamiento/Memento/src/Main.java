
public class Main {

	public static void main(String[] args) {
		CareTaker caretaker = new CareTaker();
		Originator originator = new Originator();
		
		originator.setState("A");
		originator.setState("B");
		originator.setState("C");
		
		caretaker.addMemento(originator.save());
		Memento memento = caretaker.getMemento(0);
		System.out.println(memento.getState());
		
		
		originator.setState("D");
		originator.setState("E");
		caretaker.addMemento(originator.save());
		Memento memento2= caretaker.getMemento(1);
		System.out.println(memento2.getState());
	}
	

}
