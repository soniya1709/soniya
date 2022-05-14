package encapsulation;

public class Test {

	public static void main(String[] args) {
		
		Employee e1=new Employee(20,"Sham");
		System.out.println(e1);
		
		Employee e=new Employee();
		e.setEmpid(10);
		e.setName("Ram");
		System.out.println(e.getEmpid());
		System.out.println(e.getName());
		
	}
}
