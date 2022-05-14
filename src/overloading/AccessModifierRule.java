package overloading;

public class AccessModifierRule {
	
	 public static void method(int i)
	{
		System.out.println("method(int i)"+i);
	}
     
	 protected static void method(int i,int j)//No Rule for Access Modifier;
		{
			System.out.println("method(int i,int j)"+i+","+j);
		}
	 
	 public synchronized void method(Integer i,Integer j)throws Exception//No rule for exception;
		{
			System.out.println("method(Integer i,Integer j)"+i+","+j);
		}

	 public synchronized void method(Integer i)//No Rule for Non Access Modifier
		{
			System.out.println("method(Integer i)"+i);
		}
	 
	 public static char method(char i)//No Rule for Return type;
		{
			System.out.println("method(char i)"+i);
			return i;
		}
	 
	 public static void main(String[] args) {
		
		 method('a');
	}
}
