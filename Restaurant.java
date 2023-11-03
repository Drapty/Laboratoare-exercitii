import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Restaurant{

    

     class meniu{

        int nr;
    String nume;
    float pret;
    float recenzie;

    /* 
    meniu(int nr,String nume,String pret, float recenzie)
    {
        this.nr=nume;
        this.nume=nume;
        this.pret=pret;
        this.recenzie=recenzie;
    }
    */

   

    public void adaugare(int i)
    {
        String meniu;
        float pret;
        float recenzie;

        Scanner sc=new Scanner(System.in);
        System.out.print("meniu nou:");
        meniu=sc.nextLine();
        System.out.print("pret meniu nou nou:");
        pret=sc.nextFloat();
        System.out.print("recenzie meniu nou:");
        recenzie=sc.nextFloat();
                

       
        System.out.println("meniu nou:"+meniu);
        

        System.out.println("pret meniu nou:"+pret);

        System.out.println("recenzie meniu nou:"+recenzie);


        
        Restaurant[i].meniu=meniu;
        Restaurant[i].pret=pret;
        Restaurant[i].recenzie=recenzie;
        i++;


         scanner.close();


       


    }

    public void stergere(int i)
    {
        Restaurant[i].meniu=null;
        Restaurant[i].pret=null;
        Restaurant[i].recenzie=null;



        System.out.println("meniul"+Restaurant[i].meniu+"a fost sters");


    }


    public void medieevaluare(int n)
    {
        float medie=0;
        for (int i=0;i<n;i++)
        {
            medie=medie+Restaurant[i].recenzie;


        }
        medie=medie/i;

        System.out.println("medie recenzii:"+medie);


    }
    }

    public static void main(String[] args)
{
    int buton;
    Scanner sc=new Scanner(System.in);
    buton=sc.nextInt();
    int i=0;
    
    Restaurant.meniu[] meniuri;
    meniuri=new Restaurant.meniu[15];

    

    
    switch(buton)
    {
        case 1:
        meniuri[i].adaugare(i);

        case 2:
        meniuri[i].stergere(i);

        case 3:
        break;
    }

       //meniuri[0].meniu=meniu;
    


    
    




}
}