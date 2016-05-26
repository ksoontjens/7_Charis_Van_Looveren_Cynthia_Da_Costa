public class Factuur implements Betaalbaar{

	public int factuurBedrag=0.0f;
	public int factuurNr=0;

	public Factuur(int factuurNr, float factuurBedrag)
	{
	this.factuurBedrag=factuurBedrag;
	this.factuurNr=factuurNr;
	}
	
	public void betaal()
	{
	System.out.println("Betaal het factuur van " + factuurBedrag);
	}


}