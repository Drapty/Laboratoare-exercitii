import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class laboratorul2 {

public static void main(String[] args) {
    


   
    //exe 1
    /* 
    Scanner sc=new Scanner(System.in);
    ContBancar user=new ContBancar(0.0);
    System.out.print("suma de depozitare:");
double num=sc.nextDouble();
    user.Depozitare(num);

    System.out.print("suma de depozitare:");
    double num1=sc.nextDouble();
    user.Depozitare(num1);
*/
    //exe2

    /* 
    System.out.println("tasta 1 pt sold");
    System.out.println("tasta 2 pt retragere");
    System.out.println("tasta 13 pt sold");
int tasta;
tasta=sc.nextInt();
    switch(tasta)
    {
        case 1:
user.soldare();
case 2:
double ret;
ret=sc.nextDouble();
user.retragere(ret);
*/

// ex 2

/* 
    ContBancar user1=new ContBancar("Ursan",500);
double num2=300;





    user1.Depozitare(num2);

    user1.soldare();

    Random r=new Random();

    int num3=r.nextInt();
    int prob;
    double num4;
    if (num3>=0 & num3<=1000)
    {
for (int i=0;i<num3;i++)
{
    num4=r.nextInt();
if (num4<100)
{
    prob=r.nextInt();
    if (prob>=0 & prob<=100)
    {
        if (prob<=50)
        {
    user1.Depozitare(num4);
    System.out.println("depozitare cu succes");
        }
        else
        System.out.println("depozitare cu succes");
    }
    else
    System.out.println("depozitare cu eroare");

}
else
System.out.println("depozitare cu eroare");

}
    }
    else
    System.out.println("depozitare cu eroares");


*/
    

    

    // ex3
    

    Masina car=new Masina();
    Scanner sc=new Scanner(System.in);
    
    double n=Math.random()*1000+1;
    
     for (int i=0;i<n;i++)
     {
     String newtip=sc.nextLine();
     String newculoare=sc.nextLine();
     String newviteza=sc.nextLine();
    
    
    
    car.settip(newtip);
    car.setculoare(newculoare);
    car.setviteza(newviteza);
    
    
     System.out.println(car.gettip());
     System.out.println(car.getculoare());
     System.out.println(car.getviteza());
    
     }
    

}
}

