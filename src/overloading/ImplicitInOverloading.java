package overloading;

public class ImplicitInOverloading {

	
	public static void method(long a,long b)
	{
		System.out.println("Print method(long a,long b)");//Implicit Promotion
	}
	
	
	public static void method(Integer a,Integer b)
	{
		System.out.println("Print method(Integer a,Integer b)");
	} 

	public static void main(String[] args) {
		int i=10,j=15;
		method(i,j);
	}
}
