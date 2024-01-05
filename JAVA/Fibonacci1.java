public class Fibonacci1 
{
    public static void main(String[] args)
    {
        int count=10, n1=0, n2=1, n3;
        while (count>0) 
        {
            n3=n1+n2;
            System.out.println(n1);
            n1=n2;
            n2=n3;
            count--;    
        }
    }
}
