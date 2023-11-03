import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class ex5 {

public static void main(String args[])
{
System.out.println("numarul maxim dintr un sumar de n cifre");
System.out.println("citeste nr:");
Scanner nr=new Scanner(System.in);
int numar=nr.nextInt();

int max=numar%10;
int cifra;
do 
{
numar=numar/10;
cifra=numar%10;

if (cifra>max)
    max=cifra;




}
while (numar>10);

System.out.println(max);
}

}
