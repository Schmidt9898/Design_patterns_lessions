package compositeEx2;

public class Deliverable extends component {

	private final String name;
	private final String description;
	private final Contact contact;

	public Deliverable(String name_,String description_,Contact contact_){
		name = name_;
		description = description_;
		contact = contact_;
	}

	@Override
	public void addProjectItem(component c) throws Exception {
		throw new Exception("Don't try to do child-related operations on a Deliverable!");
	}

	@Override
	public String getDescription(int dept) {
		return description;
	}

	@Override
	public double getTimeNeeded() {
		return 0;
	}

	
}
