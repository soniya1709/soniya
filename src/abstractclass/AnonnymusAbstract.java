package abstractclass;
abstract class Student
{
	int roll;
	String name;
	public abstract void m1();
	public void m2()
	{
		System.out.println("inside method m2");
	}
}
public class AnonnymusAbstract {
public static void main(String[] args) {
	Student s=new Student()
			{

				@Override
				public void m1() {
					System.out.println("inside method m1");
					
				}
		
			};
			s.m1();
			s.m2();
}
}
