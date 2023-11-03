package Grade;

class Gradec {

    int Celsius;
    int Fahrenheit;
    Grade(int Celsius, int Fahrenheit)
    {
        this.Celsius=Celsius;
        this.Fahrenheit=Fahrenheit;


    }
static int convertCtoF(int Celsius)
{
double convert=Celsius*(9/5)+32;
return convert;

}

static int convertFtoC(int Fahrenheit)
{
    double convert=Fahrenheit-32*5/9;
    return convert;


}

public static void main(String args[])
{



}

}