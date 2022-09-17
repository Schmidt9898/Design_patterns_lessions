package compositeEx2;

import java.util.ArrayList;

public class Task extends component {

	private final String name;
	private final String details;
	private final Contact contact;
	private final double time_needed;

	private final ArrayList<component> subcomponents = new ArrayList<>();

	public Task(String name_, String details_, Contact contact_, double time){
		name = name_;
		contact = contact_;
		details = details_;
		time_needed = time;
	}


	@Override
	public void addProjectItem(component c) {
		subcomponents.add(c);		
	}

	@Override
	public String getDescription(int dept){
		String full_disc = details; //i added here the discription. The Assigment did not tell what to do with this. 
		for (component c : subcomponents) {
			full_disc += "\n" +new String(new char[3*dept]).replace('\0', ' ') + c.getDescription(dept+1);
		}
		return full_disc;
	}

	@Override
	public double getTimeNeeded() {
		double total_time_needed = 0;
		for (component c : subcomponents) {
			total_time_needed += c.getTimeNeeded();
		}
		return total_time_needed + time_needed;
	}
	
}
