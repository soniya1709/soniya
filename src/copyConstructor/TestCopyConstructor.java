package copyConstructor;

public class TestCopyConstructor {
 public static void main(String[] args) {
	
	 Address add=new Address("Pune","India",4135636);
	 
	 Student s=new Student(10,"Ram",add);
	 
	 System.out.println("Original s="+s);
	 
	 Student s1=new Student(s);//call of copy constructor;
	 System.out.println("copy constructor Student stud="+s1);
}
}
