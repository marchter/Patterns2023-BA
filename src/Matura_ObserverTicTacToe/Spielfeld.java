package Matura_ObserverTicTacToe;

public class Spielfeld 
{
	private int[][] matrix;

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) 
	{
		this.matrix = matrix;
	}

	
	@Override
	public String toString() 
	{
		String s = "";
		for(int i=0; i < matrix[0].length; i++ )
		{
			for(int j=0;j < matrix.length;j++)
			{
				s+=" " + matrix[i][j] + " ";
			}
			s+="\n";
		}
		return s;
	}
	

	
	
}
