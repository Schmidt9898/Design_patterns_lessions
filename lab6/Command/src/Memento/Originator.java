package Memento;

public class Originator {
	double state = 0;

	public Originator(double s) {
		state = s;
	}
	public void SetMemento(Memento m)
	{
		state = m.state;
	}
	public Memento CreateMemento()
	{
		Memento m = new Memento();
		m.state = state;
		return m;
	}
	public String print()
	{
		return (new Double(state)).toString();
	}
	public void dodouble() {
		state*=2;
	}
	public void dohalf() {
		state/=2;
	}

}
