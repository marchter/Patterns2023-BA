package Matura_TicTacToe2;


public class Spielzug implements CommandInterface {

	private Field player;
	private Position pos;
	private Spielfeld spielfeld;
	

	public Spielzug(Field player, Position pos, Spielfeld spielfeld)
	{
		this.player = player;
		this.pos = pos;
		this.spielfeld =spielfeld;
	}
	
	@Override
	public void ausführen() 
	{
		spielfeld.Zug(this.pos, this.player);
	}

	@Override
	public void undo()
	{
		spielfeld.Zug(this.pos, new Field("_"));
	}

	@Override
	public void redo() 
	{
		spielfeld.Zug(this.pos, this.player);

	}



}
