import java.util.Scanner;
import java.util.Random;

public class ex1 {

    public static void main(String args[]){
       

        Random num=new Random();
        
        
        int nr=num.NextInt(255);
        int nr1=num.NextInt(255);
        System.out.printf("nr1=%d, nr2=%d",nr,nr1);
        
        

       Random rand=new Random();
int random1=rand.nextInt(255);
        
          System.out.printf("a) suma=%d",nr+nr1);
          System.out.printf("a) produs=%d",nr*nr1);
          System.out.printf("b) cat=%d",nr/nr1);
          System.out.printf("b) rest=%d",nr%nr1);
System.out.printf("c) primul nr=%d",nr*random1);
System.out.printf("c) al doilea nr=%d",nr1*random1);



        
    }
}

