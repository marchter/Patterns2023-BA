package Matura_StrategyShopping;

public class Client {

	public static void main(String[] args)
	{
		Shoppingcart s = new Shoppingcart();
		s.addArtikel(new Artikel(400));
		s.addArtikel(new Artikel(20));

		s.zahlen();
		
		s.setZ(new Mastercard());
		s.zahlen();
	}

}
