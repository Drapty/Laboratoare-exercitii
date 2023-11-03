public class  RandomOutTask implements ITask
{
int numar;
    public void RandomOut()
    {

        
        Random random=new Random();
        this.numar=random.nextInt();
        System.out.println(this.numar);


    }
}
