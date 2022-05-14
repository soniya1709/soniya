package overloading;

public class Autoboxing {
	
	public static void method(long a,Long b)
	{
		System.out.println("Print method(long a,Long b)");
	}
	
	
	public static void method(Integer a,Integer b) //Autoboxing;
	{
		System.out.println("Print method(Integer a,Integer b)");
	} 

	public static void main(String[] args) {
		int i=10,j=15;
		method(i,j);
	}

}
