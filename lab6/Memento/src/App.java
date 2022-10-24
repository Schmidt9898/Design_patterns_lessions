import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

import Memento.Memento;
import Memento.Originator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Dubler!");


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Give a number.");
        String line = reader.readLine();
		
		Stack<Memento> mementos = new Stack<>();
		Originator originator = new Originator(Double.parseDouble(line));
		

		while( !(line = reader.readLine()).equals("exit") )
		{
			if(line.equals("d"))
			{
				//double
				mementos.push(originator.CreateMemento());
				originator.dodouble();
			}else if (line.equals("h"))
			{
				//half it
				mementos.push(originator.CreateMemento());
				originator.dohalf();
			}else if (line.equals("c"))
			{
				//undo
				if(!mementos.empty())
					originator.SetMemento(mementos.pop());
			}
			System.out.println(originator.print());
			
		}


    }
}
