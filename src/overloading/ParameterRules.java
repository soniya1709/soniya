package overloading;

public class ParameterRules {

	public static void method(int i)//All method name same for Overloading;
	{
		System.out.println("method(int i)" +i);
	}
	
	
	public static void method(int i,int j)//Number of parameter different;
	{
		System.out.println("method(int i,int j)"+i+ " , "+j);
	}
	
	
	public static void method(long j,int i)//Sequence of parameter different;
	{
		System.out.println("method(long j,int i)"+j+ " , "+i);
	}
	
	
	public static void method(Integer i,Integer j)//Type of parameter different;
	{
		System.out.println("method(Integer i,Integer j)"+i+ " , "+j);
	}
	
	public static void main(String[] args) {
		
		method(10,20);
	}
	
}
