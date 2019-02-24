import java.util.ArrayList;

public class ToDO implements ItemProject {
	private String nombre;
	private String responsable;
	private ArrayList<ItemProject> children;
	
	public ToDO(String n, String r){
		this.nombre=n;
		this.responsable=r;
		this.children=new ArrayList<ItemProject>();
	}
	@Override
	public void imprimir() {
		System.out.println("Todo "+this.nombre+" responsable: "+this.responsable);
		for(ItemProject item: children) {
			System.out.print("\t");
			item.imprimir();
		}

	}
	@Override
	public void addItemProject(ItemProject ip) {
		children.add(ip);
	
	}

}
