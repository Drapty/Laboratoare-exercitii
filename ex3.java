import java.util.Scanner;
import java.util.Random;

public class ex3 {
        public static void main(String args[]){
        System.out.printf("numar citit:");
        Scanner sc=new Scanner(System.in);
        int nr=sc.nextInt();

        System.out.println("alege optiunea:");
        System.out.println("1 pentru paritate ultima cifra;");
        System.out.println("2 pentru paritate prima cifra;");
 
        System.out.println("3 afisare suma cifrelor;");

          Scanner sc1=new Scanner(System.in);
        int op=sc1.nextInt();
       
        switch(op)
        {
case 1:
do {
nr=nr/10;
}
while (nr>=10);
int par1=nr;
System.out.printf("%d",par1);
if (par1%2==0)
{
    System.out.printf("par");
    

}
else
System.out.printf("nu");
break;
case 2:

nr=nr%10;


int par2=nr;
System.out.printf("%d",par2);
if (par2%2==0)
{
    System.out.printf("par");
    

}
else
System.out.printf("nu");
break;
case 3:
int suma=0;
int cifra=0;
do {

cifra=nr%10;
nr=nr/10;
 suma=suma+cifra;
}
while (nr>0);

System.out.printf("%d",suma);
break;
        }
    }
}
