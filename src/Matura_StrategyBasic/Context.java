package Matura_StrategyBasic;

public abstract class Context 
{
	private Strategy s = new ConcreteStrategy();

	
	public Strategy getS() {
		return s;
	}

	public void setS(Strategy s) {
		this.s = s;
	}
	
	public void execute()
	{
		s.execute();
	}
	
}
