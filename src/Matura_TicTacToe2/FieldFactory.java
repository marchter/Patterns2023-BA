package Matura_TicTacToe2;

public class FieldFactory 
{
	public static Field createField(String s)
	{
		Field f = null;

		switch(s)
		{
			case("X"):
			f = new XField();
		    break;

			case("O"):
			f = new OField();
		    break;

			case("_"):
			f = new _Field();
		    break;

		}
		return f;
	}
	
}
