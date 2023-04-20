package Matura_Singleton;

public class Client 
{
	public static void main(String[] args) {
		BankWerte bankWerte = new BankWerte();
		bankWerte.setKontoZinsen(3.0);
		
		System.out.println(bankWerte.getKontenZinsen());

	}
}
