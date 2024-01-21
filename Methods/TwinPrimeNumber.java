public class TwinPrimeNumber 
{
    public static void main(String[] args) 
    {
        int n= 100;
        int i =2;
        int n1 = prime(i);
        int n2;
        for (; i<=n; i=n2) 
        {
            n2=prime(i+1);
            if (n2-n1<=2) 
            {
                System.out.println(n1+" "+n2);
            }
            n1=n2;
        }
    }

    public static int prime(int num)
    {
        int n =2;
        for (int i = n; ; i++) 
        {
            int j=1;
            for (; j < i; j++) 
            {
                if (i%j==0) 
                {
                   break; 
                }
            }
            if (i==j) 
            {
                return i;
            }
        }
    }
}
