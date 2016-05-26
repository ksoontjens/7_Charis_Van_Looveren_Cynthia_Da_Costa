package org.kdg.personeel //package moet zelfde naam hebben als mappenstructuur (dus hier is da personeel in map kdg in map org) en ge moet de klasses er in slepen
//package moet ge voor elke klasse zetten, ge kunt ook vanboven import org.kdg.personeel.* -->alles declareren
/**
*@author Charis Van Looveren
*/
public class Werknemer implements Betaalbaar{				//blz 21
	public String voornaam;
	public String achternaam;
	public int werknemerNummer;
	protected float salaris;	
	private float RSZpercentage=33.0f;
	
	public static int aantalWerknemers;	

	public Werknemer(String voornaam, String achternaam, int wNummer, float salaris) //constructor, zelfde naam als main classe, er s hier ook nen default	
	{
	this.voornaam=voornaam; //this om zeker te zijn dat ja datalid hebt, niet de parameter
	this.achternaam=achternaam;
	werknemerNummer=wNummer;
	this.salaris=salaris;
	}

	public void salarisverhogen(int percentage)
	{
	salaris=salaris * (1+(percentage/100.0f));
	}
	
	public float getSalaris() // om salaris op te vragen, want tis protected (ookbij private) is ipv properties
	{
	return salaris;
	}

	float getRSZ() {
	return RSZpercentage;
	}

	void setRSZ(float RSZ)
	{
	RSZpercentage=RSZ;
	}

	public void betaal(){
	System.out.println("Betaal het salaris van " + salaris + " aan de werknemer " + voornaam);
	

	}

}