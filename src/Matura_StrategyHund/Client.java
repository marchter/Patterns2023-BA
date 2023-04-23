package Matura_StrategyHund;

public class Client 
{
	public static void main(String[] args) {
		Husky h = new Husky();
		h.setName("husky1");
		h.bellen();
		h.setBv(new NichtBellen());
		h.bellen();
	}
}
