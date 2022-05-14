package aggregation;

public class Address {
	String colony;
	String city;
	int pin;
	
	
	
	public Address() {
		super();
	}



	public Address(String colony, String city, int pin) {
		super();
		this.colony = colony;
		this.city = city;
		this.pin = pin;
	}



	@Override
	public String toString() {
		return "Address [colony=" + colony + ", city=" + city + ", pin=" + pin + "]";
	}
	
	

}
