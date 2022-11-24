import java.util.ArrayList;
import java.util.List;

public class ObjectifiedDatabase{

	ArrayList<Record> records = new ArrayList<>(); 

	public void add(String author, String title, String location) {
		records.add(new ObjectRecord(author, title, location));
	}

	public void merge(ObjectifiedDatabase from) {
		for (Record record : from.get_records()) {
			records.add(record);
		}
	}

	public String get_location_by_author(String aut) {
		for (Record record : records) {
			if(record.get_author().equals(aut))
			{
				//found it
				return record.get_location();
			}
		}
		return "Not found";
	}

	public String get_location_by_title(String title) {
		for (Record record : records) {
			if(record.get_title().equals(title))
			{
				//found it
				return record.get_location();
			}
		}
		return "Not found";
	}

	public List<Record> get_records() {
		return records;
	}

}
