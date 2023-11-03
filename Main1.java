import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main1 {

public class Floare
{


}


private class Gradina
{

    String locatie;
    String nume;
    String numeplanta;
    String proprietar;
    float pretintrare;

    Gradina(String locatie, String nume,String numeplanta)
    {
this.locatie=locatie;
this.nume=nume;
this.numeplante=numeplante;


    }


    // 2 constructori
    public Gradina()
    {
this.locatie= "null";
this.nume= "null";
    }

    public Gradina(String numeplanta)
    {
this.numeplanta=numeplanta;




    }

//  2 get, sett private
    public String nume()
    {
        return nume;
    }

    public double locatie()
    {
return locatie;
    }


public void setpropr(String newproprietar)
{
    this.proprietar=newproprietar;
}

public void setpret(float newpret)
{
    this.pretintrare=newpret;
}


//2metode

public void afisare(){

System.out.println("numele Gradinii este " + nume);
System.out.println("Locatiaa gradinii " + nume + "este" + locatie);



}

public void plantagradina()
{
    Planta floare=new Planta();
    floare.nume=numeplanta;


}


public String toString()
{
return nume+" "+locatie+numeplanta;


}
}

////planta
private class Planta {

    String numeplanta;
    String locatie;
   int pret;

Planta(String locatie,String numeplanta, int pret){

this.locatie=locatie;
this.numeplanta=numeplanta;
this.pret=pret;


}
    // 2 contructori
    public Planta(String newnume,String newlocatie)
    {
this.locatie= "null";
this.nume= "null";
    }

    public planta(String numeplantanou)
    {
this.numeplanta="null";

    }


    //get
    public String numelocatie()
    {
        return locatie;
    }

    public String nume()
    {
return numeplanta;
    }

//set
public void setpropr(String newllocatie)
{
    locatie=newlocatie;
}

public void setpret(double newlocatie)
{
    numeplanta=newlocatie;
}

// 2 metode

public void afisare(){

System.out.println("numele Florii este " + numeplanta);
System.out.println("Locatia gradinii " + numeplanta + "este" + locatie);

}


public void pret(int suma)
{

    if (suma>=0)
    {
pret=pret+suma;
    }
else
{
    pret=pret-suma;
}



}

public String toString(){

    return numeplanta+" "+locatie;


}
}

}

















    









//main
public static void main (String args[])
{

    String numeplanta;
    String locatie;
    int pret;
    Scannner sc=new Scanner(System.in);
numeplanta=sc.nextLine();
locatie=sc.nextLine();
pret=sc.nextLine();

Planta plant=new Planta(numeplanta,locatie,pret);







//exe2

System.out.println(plant);

Floare ghiocel=new Floare();
}


}









