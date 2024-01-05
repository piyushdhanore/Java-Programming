public class FactorialDigitSum 
{
    public static void main(String[] args) 
    {
        int num = 12345;
        int temp = num;
        int sum = 0;
        while (num>0) 
        {
            int rem = num%10;
            int fac = 1;
            for(int i =rem; i>0; i--)
            {
                fac = fac*i;
            }
            sum+=fac;
            num/=10;
        }
        System.out.println("Factorial of "+temp+" is "+sum);

    } 
}
