package Matura_StrategyHund;

public class NichtBellen implements BellVerhalten{

	@Override
	public void bellen() {
			System.out.println("NichtBellen");
	}
}
