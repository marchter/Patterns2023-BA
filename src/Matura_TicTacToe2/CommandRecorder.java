package Matura_TicTacToe2;

import java.util.Stack;

public class CommandRecorder
{

	private Stack<CommandInterface> undo = new Stack<CommandInterface>();
	private Stack<CommandInterface> redo = new Stack<CommandInterface>();
	
	public void ausführen(CommandInterface c) 
	{
		c.ausführen();
		undo.push(c);
	}

	
	public void undo() 
	{
		CommandInterface c = undo.pop();
		redo.push(c);
		c.undo();
	}
	
	public void redo() 
	{
		CommandInterface c = redo.pop();
		undo.push(c);
		c.redo();
	}

}
