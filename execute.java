import java.util.*;

import Grade;
class execute{

    public static void main(String args[])
    {
    int celsius;
    Scanner sc=new Scanner(System.in);
    celsius=sc.nextInt();
celsius=convertCtoF(celsius);
System.out.println(celsius);

celsius=convertFtoC(celsius);
System.out.println(celsius);
    }


}