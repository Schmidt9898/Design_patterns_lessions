
public class Intersection implements Runnable {
	private Light signal = Light.RED;
	private Car car_in = null;
	//System.out.println("");		

	public boolean isGreen(){
		return signal == Light.GREEN;
	}

	public synchronized void Entering(Car car) throws InterruptedException
	{
		while(true)
		{
			if(car_in != null || !isGreen())
			{
				this.wait();
			}else
			{
				System.out.println("Car "+car.id+" entered the intersection");
				car_in = car;
				return;
			}
		}
	}
	public synchronized void Exiting(Car car) throws Exception
	{
		if(car_in != car)
		{
			System.out.println("BAJVAAAAAAAAAAAAAAAAAAN");
			throw new Exception("Car cant leave intersection it isn't in.");
		}else
		{
			car_in = null;
			System.out.println("Car "+car.id+" exited the intersection");
			this.notifyAll();
		}
	}
	
	
	
	@Override
	public void run() {
		System.out.println("Light thread started");
		try {
		while(!Thread.interrupted())
		{
			Thread.sleep(2500);
			synchronized (this)
			{
				if (signal == Light.GREEN)
				{
					System.out.println("Signal turns RED");
					signal = Light.RED;
				}else
				{
					System.out.println("Signal turns GREEN");
					signal = Light.GREEN;
					this.notifyAll();
				}
			}
		}
	} catch (InterruptedException e) {
		//e.printStackTrace(); //dont show me this :)
	}
	System.out.println("Light thread ended");
	}


}
