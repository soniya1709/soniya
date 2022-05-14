package overloading;

public class SimpleOverloadedMethod {
	public static void method(int a)
	{
		System.out.println("Print method(int a)" +a);
	}
	public static void method(int a,int b)
	{
		System.out.println("Print method(int a,int b)");
		System.out.println(a+b);
	}
	
	public static void method(int a,int b,int c)
	{
		System.out.println("Print method(int a,int b int c)");
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		int i=10, j=20;
		method(i,j);
		method(i,j,10);
		method(i);
	}
	
	
}
