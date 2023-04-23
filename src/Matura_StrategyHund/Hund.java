package Matura_StrategyHund;

public abstract class Hund 
{
	private String name;
	
	private BellVerhalten bv = new LeiseBellen();

	
	public void bellen()
	{
		bv.bellen();
	};

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public BellVerhalten getBv() {
		return bv;
	}


	public void setBv(BellVerhalten bv) {
		this.bv = bv;
	}
	

}
