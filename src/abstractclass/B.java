package abstractclass;

 interface InterFaceDemo{
	int i=10;
	public void print(); 
	

}
abstract class A implements InterFaceDemo
{
public void show()
{
	System.out.println("show inside abstract class");
}

}
public class B extends A
{
public static void main(String args[])
{
	B b=new B();
	b.print();
	b.show();
}

public void print() {
System.out.println("inside print method");
	
}
}
