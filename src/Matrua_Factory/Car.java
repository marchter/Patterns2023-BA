package Matrua_Factory;

abstract class Car 
{
	public void lackieren() {System.out.println("lackiert");};
	public void polieren() {System.out.println("poliert");};
	protected abstract void bauen();
}

class BMW_E36 extends Car
{
	
	@Override
	protected void bauen() {
		System.out.println("BMW_E36 gebaut");
	}
	
}

class BMW_X5 extends Car
{
	
	@Override
	protected void bauen() {
		System.out.println("BMW_X5 gebaut");
	}
	
}

class Mercedes_SLS extends Car
{
	
	@Override
	protected void bauen() {
		System.out.println("Mercedes_SLS gebaut");
	}
	
}
class Toyota_Supra extends Car
{
	
	@Override
	protected void bauen() {
		System.out.println("Toyota_Supra gebaut");
	}
	
}