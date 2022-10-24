package Memento;

import java.util.Stack;

import Command.Command;

public class DoubleCommand implements Command{
	
	Stack<Memento> history;
	
	public DoubleCommand(Stack<Memento> history)
	{
		this.history = history;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
	}
}
