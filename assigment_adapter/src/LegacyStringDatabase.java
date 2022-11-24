import java.util.ArrayList;

public class LegacyStringDatabase {
	public ArrayList<String> records = new ArrayList<String>(); 
	public void addentry(String record)
	{
		records.add(record);
	}
	public String location_from_title(String title)
	{
		for (String record : records) {
			String[] parts = record.split("\\|");
			if(parts[1].equals(title))
			{
				//found it
				return parts[2];
			}
		}
		return "Not found";
	}
	public String location_from_aut(String aut)
	{
		for (String record : records) {
			String[] parts = record.split("\\|");
			if(parts[0].equals(aut))
			{
				//found it
				return parts[2];
			}
		}
		return "Not found";
	}
}
