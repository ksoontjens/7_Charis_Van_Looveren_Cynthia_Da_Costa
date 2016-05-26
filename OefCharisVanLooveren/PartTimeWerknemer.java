/**
*@author Charis Van Looveren
*/
public class PartTimeWerknemer extends Werknemer
{
public int urenGewerkt;

public PartTimeWerknemer ( String voornaam, String achternaam, int wNummer, float salaris, int urengw)
{
super(voornaam,achternaam,wNummer,salaris); //roept constructorinhoud van de werknemer op, moet op de 1e lijn!!!
this.urenGewerkt=urengw;
}

public float getWeekLoon()
{
return this.salaris * (float)this.urenGewerkt;

}

public void salarisverhogen(int percentage)
{
	if(percentage>5)
	 {
	System.err.println("Fout: Parttimewerknemer kunnen slecht 5% opslag krijgen");
	}
	else
	{
	super.salarisverhogen(percentage);
	}


}











}