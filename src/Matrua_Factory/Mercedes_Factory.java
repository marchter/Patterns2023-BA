package Matrua_Factory;

public class Mercedes_Factory extends CarShop
{

	@Override
	protected Car createCar(String zuHolendesAuto)
	{
		Car c = null;
		switch(zuHolendesAuto)
		{
		case "Mercedes_SLS":
			c = new Mercedes_SLS();
			break;
		}
		return c;
		
	}
	
}
