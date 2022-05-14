
public class CustomClass implements Deletable {

 public static boolean delete(Object obj) {
	if(obj instanceof Deletable) {
		return true;
	}
	return false;
}
public static void main(String[] args) {
	Employee emp=new Employee(10,"Sham");
//	Integer i=20;
	System.out.println(delete(emp));
}
}