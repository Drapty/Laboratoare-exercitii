class CandyBox
{
private String flavour;
private String origin;

CandyBox()
{


}

CandyBox(String flavour,String origin)
{
this.flavour=flavour;
this.origin=origin;


}

public float getVolume()
{
return 0;

}

public String toString()
{

    return flavour+ " "+origin;
}

public boolean equals(CandyBox obj)
{
return true;

}

class Lindt extends CandyBox
{

   
float length;
float width;
float height;


Lindt()
{
    
}


Lindt(String flavour,String origin)
{
super(flavour,origin);

}

public float getVolume()
{
return this.lenght*this.width*this.height;

}

public String toString()
{

    return "The "+origin+""+flavour+" has volume "+volume;
}

}

class Baravelli extends CandyBox
{
 float radius;
 float height;


 Braavelli()
 {

 }


 Baravelli(String flavour,String origin)
 {
   super(flavour,origin);
 }


 public float getVolume()
 {
return this.radius*this.height;

 }


 toString()
{

    return "The "+origin+""+flavour+" has volume "+volume;
}

 



}

 class ChocAmor extends CandyBox
{
float length;


ChocAmor()
{


}

ChocAmor(String flavour,String origin)
{
    super(flavour,origin);



}

public float getVolume()
{

    return this.lenght*this.lenght*this.lenght;
}

public String toString()
{

    return "The "+origin+""+flavour+" has volume "+volume;
}


}



 public static void main(String args[])
    {

        Lindt ciochi=new Lindt("dulce","poland");
        

        System.out.println(ciochi.getVolume());
    }



}