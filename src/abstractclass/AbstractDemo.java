package abstractclass;

public abstract class AbstractDemo {
	int rollNo;
	String name;
	
	
	
	public AbstractDemo() {
		super();
	}



	public AbstractDemo(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}



	public abstract void Detail();
	
}
