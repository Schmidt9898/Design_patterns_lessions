package compositeEx2;

import java.util.ArrayList;

public class Project extends component {
	
	private final String name;
	private final String description;
	private final ArrayList<component> subcomponents = new ArrayList<>();

	public Project(String name_,String description_)
	{
		name = name_;
		description = description_;
	}


	@Override
	public void addProjectItem(component c) {
		subcomponents.add(c);		
	}

	@Override
	public String getDescription(int dept) {
		String full_disc = description;
		for (component c : subcomponents) {
			full_disc += "\n" + new String(new char[3*dept]).replace('\0', ' ') + c.getDescription(dept+1);
		}
		return full_disc;
	}
	public String getDescription() {
		String full_disc = description;
		for (component c : subcomponents) {
			full_disc += "\n" + c.getDescription(1);
		}
		return full_disc;
	}

	@Override
	public double getTimeNeeded() {
		double total_time_needed = 0;
		for (component c : subcomponents) {
			total_time_needed += c.getTimeNeeded();
		}
		return total_time_needed;
	}
	
}
