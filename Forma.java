public class Forma {


    public float arie()
    {
return 0;


    }

    public float perimetru()
    {
return 0;
    }
    

    class Dreptunghi extends Forma
    {
float width;
float length;

Dreptunghi(float width,length)
{
this.width=width;
this.length=length;
    }

    public float perimetru()
    {
        return 2(width+lenght);


    }

    public float arie()
    {
        return width*length;



    }


    class Cerc extends Forma
    {

        





    }

    class Triunghi extends Forma
    {
        float side1;
        float side2;
        float side3;
        float heigth;

        Triunghi(float side,float heigth) // echilateral
        {
            this.side1=side;
            this.side2=side;
            this.side3=side;
            this.heigth=heigth;

        }
        Triunghi(float side,float side2,float side3,float heigth) //oarecare
        {

            this.side1=side1;
            this.side2=side2;
            this.side3=side3;

        }

        Triunghi(float side,float side,float heigth) //isoscel
        {
this.side1=side;
this.heigth=heigth;

        }

        public float perimetru()
        {

            return side*3;
        }

        public float arie()
        {


        }


    }

}
}
