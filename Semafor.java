import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Semafor {

    String culoare;
    int durata;

    //costructor 
    public Semafor(String culoare,int durata)
    {
this.culoare=culoare;
this.durata=durata;

    }

    //2 metode

    public void check()
    {
if (this.culoare.equals("verde"))
{
System.out.println("verde");
    }
else
{
System.out.println("rosu");
}

    }

    public void switch1(int buton)
    {

    if (this.culoare=="rosu")
    {
        this.culoare="verde";
        this.durata=5;

        System.out.println("durata 5 secunde");
        
    }
    else
    {
        this.culoare="verde";
        this.durata=10;

        System.out.println("durata 10 secunde");
    }
    }


public static void main(String args[])
{
String inicul="verde";
int duratain=1;
    System.out.println("alege culoare semafor");
    Semafor semafor=new Semafor(inicul,duratain);
    Scanner sc=new Scanner(System.in);

String culoare1;

culoare1=sc.nextLine();
semafor.culoare=culoare1;
 System.out.println(semafor.culoare);
int buton;
buton=1;
while (buton!=0 || buton!=1)
{
//semafor.switch1(buton);
System.out.println("apasa 2 pentru a verifica culoarea la semafor");
System.out.println("apasa 0 pentru a schimba culoarea la semafor");
buton=sc.nextInt();
if (buton==2)
{
semafor.check();

}

if (buton==0)
{
semafor.switch1(buton);

}

buton=sc.nextInt();
}





}
    }



    

