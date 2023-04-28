package Matura_TicTacToe2;

public class View implements Observer {

	@Override
	public void update(String s)
	{
		System.out.println(s);
	}
	
	public void printWon(String s)
	{
		System.out.println(s);
	}



	
}
