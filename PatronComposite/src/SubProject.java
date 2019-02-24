import java.util.ArrayList;

public class SubProject implements ItemProject {
	private String name;
	private ArrayList<ItemProject> children;
	
	public SubProject(String n) {
		this.name=n;
		this.children=new ArrayList<ItemProject>();
	}
	
	@Override
	public void imprimir() {
		System.out.println("Subproyecto: "+this.name);
		for(ItemProject it: this.children) {
			System.out.print('\t');
			it.imprimir();
		}
	}

	@Override
	public void addItemProject(ItemProject ip) {
		children.add(ip);
				
	}

}
