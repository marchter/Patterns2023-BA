package Matura_Singleton;

class BankWerte 
{
	private double Kontenzinsen;

	
    private static BankWerte einzigartigeBankwerte;
    
    public static BankWerte getInstance() {
    	if (einzigartigeBankwerte == null)
    	{
    		einzigartigeBankwerte = new BankWerte();
    	}
    	return einzigartigeBankwerte;
    }
    
    public void setKontoZinsen(double KontoZinsen)
    {
        if (KontoZinsen > 0 && KontoZinsen < 7){
        	this.Kontenzinsen = KontoZinsen;
        }
    }
    
    
    public double getKontenZinsen()
    {
    	return this.Kontenzinsen;
    }


}
