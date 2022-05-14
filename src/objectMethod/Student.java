package objectMethod;

public class Student implements Cloneable {

	int rollno;
	String name;
	
	
	public Student() {
		super();
	}
	
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}


	public static void main(String[] args)throws Throwable {
		
		Student s1=new Student(10,"Soniya");
		System.out.println(s1.hashCode());
		System.out.println("s1="+s1);
		
		Student s2=(Student)s1.clone();
		System.out.println("s2="+s2);
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
	}

}
