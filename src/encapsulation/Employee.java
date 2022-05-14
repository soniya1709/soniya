package encapsulation;

public class Employee {

	private int empid;
	private String name;
	  
	
	
	public Employee() {
		super();
	}
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	public int getEmpid()
	{
		return empid;
	}
	public String getName()
	{
		return name;
	}
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	
}
