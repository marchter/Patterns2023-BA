package Matura_ObserverTicTacToe;

public class Client 
{
	
	public static void main(String[] args) {
		Controller c = new Controller();
		Gui g = new Gui();
		c.register(g);
		
		
		int[][] spielfeldZu1 = {{0,1,0},{0,0,1},{1,1,0}};
		c.makeMove(spielfeldZu1);

		int[][] spielfeldZu2 = {{0,1,0},{0,1,1},{1,1,0}};
		c.makeMove(spielfeldZu2);

		
				
	}

}
