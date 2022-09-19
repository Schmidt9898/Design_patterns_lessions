package observer;

import java.util.ArrayList;

public class Subject {
	protected int m_value;
	protected ArrayList<observer> observers = new ArrayList<>();
	public void subscribe(observer o)
	{
		observers.add(o);
	}
	public void set_value(int value)
	{
		m_value = value;
		notifyObservers();
	}
	public void notifyObservers()
	{
		for (observer observer_ : observers) {
			observer_.update(m_value);
		}
	}

	public static void main(String[] args) {
		Subject subj = new Subject();
		subj.subscribe(new DivObserver(4));
		subj.subscribe(new ModObserver(3));
		subj.subscribe(new AbsObserver());
		subj.set_value(14);
		subj.set_value(-5);
	}

}
