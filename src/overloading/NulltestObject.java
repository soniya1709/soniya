package overloading;

public class NulltestObject {

	public static void method(Object o)
	{
		System.out.println("Print method(Object o)");
	}
	
//	public static void method(String s)
//	
//	{
//		System.out.println("Print method(String s)");
//	}


	public static void method(Integer i)
	{
		System.out.println("Print method(Integer i)");
	}
	
	public static void main(String[] args) {
		method(null); //check object class hierarchy;
	}
}
