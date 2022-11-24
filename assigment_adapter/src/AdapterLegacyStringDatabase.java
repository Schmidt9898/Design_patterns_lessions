public class AdapterLegacyStringDatabase extends ObjectifiedDatabase {

	LegacyStringDatabase target;

	//ArrayList<Record> records = new ArrayList<>(); 

	public AdapterLegacyStringDatabase(LegacyStringDatabase database)
	{
		this.target = database;
		for( int i = 0;i < target.records.size();i++)
		{
			records.add(new RecordAdapter(i,target)); // it is hard to show the reference with the String so we store the reference to the database and the index of the record
		}
	}

	@Override
	public void add(String author, String title, String location) {
		target.addentry(author+"|"+title+"|"+location); // concret element
		records.add(new RecordAdapter(target.records.size()-1, target)); //reference	
	}

}
