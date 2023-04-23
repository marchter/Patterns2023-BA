package Matura_StrategyBasic;

public class ConcreteContext extends Context{
	public ConcreteContext()
	{
		setS(new ConcreteStrategy());
	}
}
