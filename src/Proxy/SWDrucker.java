package Proxy;

public class SWDrucker implements Drucker{

	private String name;
	
	public SWDrucker(String name) {
		this.name = name;
	}

	@Override
	public void drucken(String dokument) 
	{
		System.out.println(dokument + " wurde gedurckt in " + name);
	}

}
