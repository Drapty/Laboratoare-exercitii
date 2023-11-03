import java.util.Scanner;
import java.util.Random;

public class ex2 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.printf("Introduceti 2 numere: ");
        int nr=sc.nextInt();
        System.out.print(", ");
        int nr1=sc.nextInt();

       int suma=nr+nr1;
        
          System.out.printf("a) suma=%d",suma);
          System.out.printf("a) produs=%d",nr*nr1);
          System.out.printf("b) cat=%d",nr/nr1);
          System.out.printf("b) rest=%d",nr%nr1);


        
    }
}