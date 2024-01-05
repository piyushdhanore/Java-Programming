public class FactorialOfDigit 
{
    public static void main(String[] args) 
    {
        int num = 54321;
        while (num>0) 
        {
            int rem = num%10;
            int fac = 1;
            for(int i =rem; i>0; i--)
            {
                fac = fac*i;
            }
            System.out.println("Factorial of "+rem+" is "+fac);
            num/=10;
        }
    }
}
