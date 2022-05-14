package overloading;

public class VarargMethod {

		public void m1(int x)
		{
			System.out.println("inside general method");
		}
		public void m1(int...x)
		{
			System.out.println("inside var - arg method");
		}
		public static void main(String[] args) {
			VarargMethod v=new VarargMethod();
			v.m1();
			v.m1(10,20);
			v.m1(10);
		}
		}


