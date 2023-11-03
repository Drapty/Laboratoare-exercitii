class inseraresfarsit implements listasimpla
{

    int elem;
    inseraresfarsit(int elem)
    {
        this.elem=elem;
    }
    public int inserare(int[] vector,int i,int elem)
    {
        vector[i]=elem;
        i++;

        return i;



    }

    public static void main(String args[])
    {
        int[] v;
        int i=0;
        v= new int[4];
        inseraresfarsit inserare=new inseraresfarsit(6);
        i=inserare.inserare(v, i, 8)
;
 i=inserare.inserare(v, i, 9)
;
 i=inserare.inserare(v, i, 10)
;
System.out.println(v[0]);
System.out.println(v[1]);
System.out.println(v[2]);

    }

}