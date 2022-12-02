import java.util.Random;

public class Car implements Runnable {

	Intersection intersection;
	int id=-1;
	static Random rand = new Random();
	static int nextid = 1;

	public Car(Intersection _intersection)
	{
		this.intersection = _intersection;
		this.id = /*nextid++;*/ rand.nextInt(1000001);
	}

	@Override
	public void run() {
		try {
			System.out.println("Car "+id+" is approaching the intersection");
			Thread.sleep(3000);
			System.out.println("Car "+id+" arrived at the intersection");
			intersection.Entering(this);
			Thread.sleep(1000);
			intersection.Exiting(this);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
