package portemulator;

import java.util.*;

/**
 * Port emulátor
 * 
 * Néha véletlenszerűen betesz adatokat a sorába, amiket ki lehet venni.
 * Hasonló ahhoz, mintha egy hálózati kapcsolatunk lenne, ahonnan néha jönnek adatok.
 */
public class PortEmulator extends Thread
{
	//Egy másodpercben ilyen valószínűséggel generálódik adat
	float probability; 
	
	// A sorunk
	Queue<Integer> queue = new LinkedList<Integer>();
	
	public void run(){
		Random generator = new Random();
		
		while (true){
			int s = generator.nextInt(100);
			if (s < probability*100){
				synchronized (queue) {
					queue.offer(generator.nextInt(1000));
					queue.notifyAll();
				}
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public PortEmulator(float p){
		probability = p;
		start();
	}
	
/* 
	public boolean isEmpty(){
		synchronized (queue) {
			if(queue.isEmpty())
			{
				try{
					queue.wait();
					return queue.isEmpty();
				}catch(InterruptedException e)
			{
				
			}
		}
		return queue.isEmpty();
	}
}
*/
	
	public int get(){
		synchronized (queue) {
			if(queue.isEmpty())
			{
				try{
					queue.wait();
				}catch(InterruptedException e)
				{
					
				}
			}
			return queue.poll();
		}
	}
	
	
}
