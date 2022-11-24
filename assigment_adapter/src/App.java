public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Assigment Adapter!");

	// I leave this here because finding out this was the bug after 3 hour is frustrating.
	// 	String alma = "alma";
	// 	String körte = alma;
	// 	alma = "körte";
	// 	System.out.println(körte);

	// String str = "abc|defg|hi|jklm";
	// String parts[] = str.split("\\|");
	// for(String part: parts) {
	// 	System.out.println(part);
	// }

		
		LegacyStringDatabase old_database = new LegacyStringDatabase();
		// Author, Title, Location
		old_database.addentry("Jerry Smith|Never trying never fails|R&M/606");
		old_database.addentry("Exe Emple|History Of Someting|C/209");
		
		ObjectifiedDatabase old_adapted = new AdapterLegacyStringDatabase(old_database);
		
		old_adapted.add("Exe Emple","Introduction To Basics","C/209");
		old_adapted.add("Exe Emple","Class 101","C/209");
		
		ObjectifiedDatabase newer_database = new ObjectifiedDatabase();
		
		newer_database.add("Fél Rement","Learning!","H/1");
		newer_database.add("Turo Rudy","Math 1-2-3","X-304");
		newer_database.add("Mezes Pis Kota","Studyology","M41A1");
		
		ObjectifiedDatabase merged_database = new ObjectifiedDatabase();
		
		merged_database.merge(newer_database);
		merged_database.merge(old_adapted);
		
		
		String result = merged_database.get_location_by_author("Jerry Smith");
		System.out.println(result);
		System.out.println(merged_database.get_location_by_title("Class 101"));
		System.out.println(merged_database.get_location_by_author("Turo Rudy"));
		
    }
}
