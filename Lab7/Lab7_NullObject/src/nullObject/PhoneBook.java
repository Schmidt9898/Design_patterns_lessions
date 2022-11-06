package nullObject;

import java.util.HashMap;

public class PhoneBook {
	private HashMap<String,People> records;
	People notfound = new NullPeople();
	public PhoneBook() {
		records = new HashMap<String,People> ();
	}
	public People search(String name) {
		People p=records.get(name);
		if( p == null) p = notfound;
		return p;
	}
	public void add(People p) {
		records.put(p.getName(), p);
	}
}
