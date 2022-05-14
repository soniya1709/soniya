package aggregation;

public class Student {
	int rollno;
	String name;
	Address address;
	
	
	
	public Student() {
		super();
	}



	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
