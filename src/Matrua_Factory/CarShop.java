package Matrua_Factory;

public abstract class CarShop 
{
	public Car getCar(String zuHolendesAuto)
	{
		Car c = createCar(zuHolendesAuto);
		c.lackieren();
		c.polieren();
		
		
		return c;
	}
	
	protected abstract Car createCar(String zuHolendesAuto);
}
