package Matrua_Factory;

public class BMW_Factory extends CarShop
{

	@Override
	protected Car createCar(String zuHolendesAuto) {
		Car c = null;
		switch(zuHolendesAuto) 
		{
		case("BMW_E36"):
			c = new BMW_E36();
			break;
		case("BMW_X5"):
			c = new BMW_X5();
			break;
		}
		return c;
	}

}
