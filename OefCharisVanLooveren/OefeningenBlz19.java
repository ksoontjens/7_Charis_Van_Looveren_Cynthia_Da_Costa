import java.lang.*;

public class OefeningenLes1{
/**
*Oefeningen P19
*@author Charis Van Looveren
*/


//oef 5
/*static boolean IsPriemgetal(int num)
       {
          boolean isPriemgetal = true;
          int factor = num / 2;
 
            int i = 0;
 
            for (i = 2; i <= factor; i++)
            {
                if ((num % i) == 0)
                    isPriemgetal = false;
            }
            return isPriemgetal;
        }
*/



public static void main(String args[])
{
/*//oef1
int x,y;
for(x=0;x<=9;x++)
{
for(y=0;y<=9;y++)
{
	System.out.println(x + " x " + y + " = " + x*y);
}
}
*/

//oef 2
/*int dag,weekdag =0;
for(dag=1; dag<=28;dag++)
{
if(weekdag==0) System.out.print("Zondag ");
if(weekdag==1) System.out.print("Maandag ");
if(weekdag==2) System.out.print("Dinsdag ");
if(weekdag==3) System.out.print("Woensdag ");
if(weekdag==4) System.out.print("Donderdag ");
if(weekdag==5) System.out.print("Vrijdag ");
if(weekdag==6) System.out.print("Zaterdag ");

weekdag++;
if(weekdag>6) weekdag=0;
System.out.println(dag + " februari 2009");
}
*/

//oef3
/*	double pi=0.0;
		int g =1;
		double som=0.0;
		boolean somV = true;
		
		for(int i=0;i<=10000;i++)
		{
			if(somV)
			{
				som += 1.0/g;
				somV = !somV;
			}
			else
			{
				som -= 1.0/g;
				somV = !somV;
			}
			g+=2;
		}
		
		pi = 4 * som;
		System.out.println(pi);
*/

//oef4
/*int a=4302;
a= ~a;
a++;
System.out.println(a);
*/

//oef5
/*
for (int i = 3; i < 100; i++)
            {
                if (IsPriemgetal(i) == true)
                    System.out.println(i);
            }
*/

//oef6
/*int a[8]={12,34, 56, 78, 123, 234, 99, 88};

    int grootsteNummer = a[0];
               
    for(int i=1; i< a.length; i++)
    {
      if(a[i] > grootsteNummer)
	  {
       grootsteNummer = a[i];     
	  }
    }
	
System.out.println("Het grootste nummer in de reeks is: "+ grootsteNummer);
*/

//oef7

int a[8]={12,34, 56, 78, 123, 234, 99, 88};
int b[];
b = new int[8];
int grootste = 0;
int grootsteIndex = 0;
		
for(int j = 0; j<8;j++)
	{
		for(int i=0;i<8; i++)
		{
			if(a[i] > grootste)
			{
				grootste = a[i];
				grootsteIndex = i;
			}
		}
		
		b[j] = a[grootsteIndex];
		System.out.println(b[j]);
		a[grootsteIndex] = 0;
		grootste = 0;
		}

}
}


