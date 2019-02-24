import java.util.ArrayList;

public class Project  implements ItemProject{
	
	private String name;
	private ArrayList<ItemProject> children;
	
	public Project(String name) {
		this.name = name;
		this.children = new ArrayList<ItemProject>();
	}

	@Override
	public void imprimir() {
		System.out.println("Proyecto: "+this.name);
		for(ItemProject item: children) {
			System.out.print("\t");
			item.imprimir();
		}

	}
	
	public void  addItemProject(ItemProject ip) {
		children.add(ip);
		
	}
}
