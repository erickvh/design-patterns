
public class SingletonObj {
	private String x;
	private static SingletonObj singletonObj;
	
	private SingletonObj(String x) {
		this.x=x;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public static SingletonObj getSingletonObj(String x) {
		if(singletonObj==null) {
			singletonObj= new SingletonObj(x);
		}
		else {
			System.out.println("La instacia existe");
		}
		return singletonObj;
	}

	
}
