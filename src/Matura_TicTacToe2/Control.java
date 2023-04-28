package Matura_TicTacToe2;

public class Control 
{
	private View v;
	private Spielfeld s;
	
	public Control(Spielfeld s, View v)
	{
		this.s = s;
		this.v = v;
	}
	

	
	public void printSpielfeld()
	{
		v.update(s.toString());
	}
	
	public void getWonVertical()
	{
		v.printWon("vertical: "+s.isVerticalWon());
	}
	
	public void getWonHorizontal()
	{
		v.printWon("horizontal: "+s.isHorizontalWon());
	}

}
