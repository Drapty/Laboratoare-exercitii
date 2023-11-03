import java.util.Scanner;
class string
{

    string(){};


    public int convert(){
Scanner sc=new Scanner(System.in);
String text;
text=sc.nextLine();
int fahrenheit=Integer.parseInt(text);
fahrenheit=fahrenheit*9/5+32;
return fahrenheit;
    }



}