package Matura_TicTacToe2;

public class Spielfeld extends Observerable
{
	private static Spielfeld instance = null;
	
	private Spielfeld(){}
	
	public static Spielfeld getSpielfeld()
	{
		if(instance == null)
		{
			instance =  new Spielfeld();
		}
		return instance;
	}
	
	
	private Field[][] matrix = {
		    {FieldFactory.createField("_"), FieldFactory.createField("_"), FieldFactory.createField("_")},
		    {FieldFactory.createField("_"), FieldFactory.createField("_"), FieldFactory.createField("_")},
		    {FieldFactory.createField("_"), FieldFactory.createField("_"), FieldFactory.createField("_")}
		};
	
	public void Zug(Position p, Field field)
	{
		this.matrix[p.getX()][p.getY()] = field;
		notifyObserver(instance.toString());
	}
	
	

	
	public boolean isHorizontalWon()
	{
		for(int i = 0; i < matrix.length; i ++)
		{
			

				if(matrix[0][i].getType().equals(matrix[1][i].getType()) && matrix[1][i].getType().equals(matrix[2][i].getType()) )
				{

					return true;
				}
		}
		return false;
	}
	
	public boolean isVerticalWon()
	{
		for(int i = 0; i < matrix.length; i ++)
		{
				if(matrix[i][0].getType().equals(matrix[i][1].getType()) && matrix[i][1].getType().equals(matrix[i][2].getType()) )
				{
					return true;
				}
		}
		return false;
	}
	
	public String toString()
	{
		String s = "";
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[i].length; j++)
			{
				s+=matrix[j][i].getType();
			}
			s+="\n";
		}
		return s;
	}
}
