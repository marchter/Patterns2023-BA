package Matrua_Factory;

public class Client {

	public static void main(String[] args) 
	{
		CarShop MercedesShop = new Mercedes_Factory();
		Car sls = MercedesShop.getCar("Mercedes_SLS");
		sls.bauen();
		
		CarShop BMWShop = new BMW_Factory();
		Car BMW_E36 = BMWShop.getCar("BMW_E36");
		BMW_E36.bauen();
		
		Car BMW_X5 = BMWShop.getCar("BMW_X5");
		BMW_X5.bauen();
	}

}
