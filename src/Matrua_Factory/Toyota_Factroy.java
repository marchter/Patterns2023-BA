package Matrua_Factory;

public class Toyota_Factroy extends CarShop
{

	@Override
	protected Car createCar(String zuHolendesAuto) {
		Car c = null;
		switch(zuHolendesAuto)
		{
		case("Toyota_Supra"):
			c = new Toyota_Supra();
			break;
		}
		return c;
	}

}
