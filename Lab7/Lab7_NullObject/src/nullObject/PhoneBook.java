package nullObject;

import java.util.HashMap;

public class PhoneBook {
	private HashMap<String,People> records;
	public PhoneBook() {
		records = new HashMap<String,People> ();
	}
	public People search(String name) {
		return records.get(name);
	}
	public void add(People p) {
		records.put(p.getName(), p);
	}
}
