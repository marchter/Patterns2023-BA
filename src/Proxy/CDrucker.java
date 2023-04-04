package Proxy;

public class CDrucker implements Drucker{

	private String name;
	
	public CDrucker(String name) {
		this.name = name;
	}
	
	@Override
	public void drucken(String dokument) {
		System.out.println(dokument+ " wurde gedruckt in " + name);
	}

}
