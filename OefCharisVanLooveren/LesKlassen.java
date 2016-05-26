/**
*@author Charis Van Looveren
*/
public class LesKlassen {
	
	public static void main (String args[]) //nu is het een programma, je kunt het runnen
	{
	//objecten maken van klasse werknemer
	Werknemer jan;
	jan=new Werknemer("Jan", "Janssens", 1, 20.0f); //constructor aanroepen
	Werknemer herman=new Werknemer("Herman", "Hermans", 2, 30.0f); 
	Werknemer ivan=new Werknemer("Ivan", "Ivans", 3, 60.0f); 
	Werknemer dirk=new Werknemer("Dirk", "Dirks", 4, 45.0f); 

	PartTimeWerknemer johan=new PartTimeWerknemer("Johan", "Johans", 5, 12.0f, 5);
	PartTimeWerknemer lorenzo=new PartTimeWerknemer("Lorenzo", "Lores", 5, 15.0f, 18); 

	StudentWerknemer charis=new StudentWerknemer("Charis", "Van Looveren", 6, 85.0f, 9);		

	jan.salarisverhogen(10);
	herman.salarisverhogen(10);
	//johan.salarisverhogen(10);


	System.out.println(jan.voornaam + " verdient " + jan.getSalaris());
	System.out.println(herman.voornaam + " verdient " + herman.getSalaris());
	System.out.println(ivan.voornaam + " verdient " + ivan.getSalaris());
	System.out.println(dirk.voornaam + " verdient " + dirk.getSalaris());
	System.out.println(johan.voornaam + " verdient " + johan.getSalaris());
	System.out.println(lorenzo.voornaam + " verdient " + lorenzo.getSalaris());
	System.out.println(herman.voornaam + " zijn RSZ bedraagt " + herman.getRSZ());
	System.out.println(lorenzo.voornaam + " zijn RSZ bedraagt " + lorenzo.getRSZ());
	System.out.println(charis.voornaam + " haar RSZ bedraagt " + charis.getRSZ());
	System.out.println(jan.betaal());
	}
}