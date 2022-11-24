public class ObjectRecord implements Record{
	String author;
	String title;
	String location;

	public ObjectRecord(String author,String title,String location)
	{
		this.author = author;
		this.title = title;
		this.location = location;
	}

	@Override
	public String get_author() {
		return author;
	}

	@Override
	public String get_title() {
		return title;
	}

	@Override
	public String get_location() {
		return location;
	}
}
