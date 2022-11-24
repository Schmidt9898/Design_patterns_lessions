
public class RecordAdapter implements Record {
	int id;
	LegacyStringDatabase db;
	RecordAdapter(int id,LegacyStringDatabase db)
	{
		this.id=id;
		this.db=db;
	}
	@Override
	public String get_author() {
		return db.records.get(id).split("\\|")[0] ;
	}
	
	@Override
	public String get_title() {
		return db.records.get(id).split("\\|")[1];
	}
	
	@Override
	public String get_location() {
		return db.records.get(id).split("\\|")[2];
	}
}
