import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.*;



     public class Persoana
    {
        String nume,prenume;
        int an;
        int varsta;



        Persoana(String nume,String prenume)
        {
            this.nume=nume;
            this.prenume=prenume;
            
          
        }

      
        
      

//get
/* 
public String getnume()
{
    return nume;
}

public String getprenume()
{
    return prenume;
}

public String getadresa()
{
    return adresa;
}

public String getluna()
{
    return ll;
}

public String getan()
{
    return aaaa;
}


public String getziua()
{
    return zz;
}




//set

public void setname(String nume)
{
this.nume=nume;

}

public void setprenume(String prenume)
{
this.prenume=prenume;
    
}


public void setadresa(String adresa)
{
this.adresa=adresa;
    
}

public void setan(int aaaa)
{
this.aaaa=aaaaa;
    
}


public void setzi(int zi)
{
    zz=zi;

    
}

public void setluna(int ll)
{
this.ll=ll;
    
}

public String toString()
{
return nume+" "+prenume+" "+adresa+" "+aaaa+" "+ll+" "+zz;

}
*/
public static void main(String[] args)
{



Scanner sc=new Scanner(System.in);
int i;
int n;
String nume,prenume;
int varsta;
ArrayList<Persoana> arraylist =new ArrayList<Persoana>();

n=sc.nextInt();
for (i=0;i<n;i++)
{
nume=sc.nextLine();
prenume=sc.nextLine();
varsta=sc.nextInt();
arraylist.add(new Persoana(nume,prenume,varsta));

}

float medievarsta=




}
/* 
   nume=sc.nextLine();
prenume=sc.nextLine();
adresa=sc.nextLine();
an1=sc.nextInt();
ll1=sc.nextInt();
zi1=sc.nextInt();

   Persoana p2=new Persoana(nume,prenume,an1,ll1,zi1);
    Persoana p2adr=new Persoana(adresa);


System.out.print(p1+" ");
System.out.println(p1adr);
System.out.println(p2+" ");
System.out.println(p2adr);
*/

float medievarsta=0;

for (i=0;i<n;i++)
{
medievarsta=medievarsta+persoane[i].varsta;

}

medievarsta=medievarsta/i+1;

    }
}




