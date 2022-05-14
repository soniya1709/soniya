package copyConstructor;

public class Student {

	int roll;
	String name;
	Address addr;
	
	public Student() {
		super();
	}
	
	public Student(int roll, String name, Address addr) {
		super();
		this.roll = roll;
		this.name = name;
		this.addr = addr;
	}
	
	public Student(Student stud)
	{
		this.roll=stud.roll;
		this.name=stud.name;
		Address dummy=new Address();
		dummy.city=stud.addr.city;
		dummy.country=stud.addr.country;
		dummy.pin=stud.addr.pin;
		this.addr=dummy;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
}
