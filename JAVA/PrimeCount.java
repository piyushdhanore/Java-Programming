import java.util.Scanner;
public class PrimeCount 
{
    public static void main(String[] args) 
    {
        Scanner p =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = p.nextInt();
        int count = 0, den=2;

        while (num>0) 
        {
            count++;
            int rem=num%10;
            num/=10;
        }

        while (den<count) 
        {
            if (count%den==0) 
            {
                break;
            } 
            den++;
        }   
        if (den==count) 
        {
            System.out.println("count of the digits is prime");
        } 
        else
        {
            System.out.println("count of the digits is not prime");
        }
    }    
}
