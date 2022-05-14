package overloading;

public class InstanceofDemo {
public static void main(String[] args) {
	Object[] element= {'a','b',10,20,"abc"};
	for(Object o:element) {
		if(o instanceof String)
		{
			System.out.println(o);
		}
	}
}
}