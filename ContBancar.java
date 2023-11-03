

public class ContBancar {


    String name;
    private double _sold=0.0;

public ContBancar(double sold){

    _sold=sold;
}

public void Depozitare(double suma){

    _sold=_sold+suma;
}

    public void soldare(){
System.out.print("sold:");
System.out.print(_sold);
    }

    public void retragere(double ret){
        System.out.print("suma de retragere:");
        System.out.print(ret);
        _sold=_sold-ret;
    }

    ContBancar(String n,double m){
        this.name=n;
        this._sold=m;
    }
public String toString()
{
    return "nume:"+this.name+" sold:"+this._sold;

}


}