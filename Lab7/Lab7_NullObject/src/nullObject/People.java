package nullObject;

public class People {
	private String name;
	private String address;
	private String number;
	public People(String n, String a, String u) {
		name = n;
		address = a;
		number = u;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getNumber() {
		return number;
	}
	
}
