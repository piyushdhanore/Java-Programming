import java.util.Scanner;
public class FactorialOfDigit 
{
    public static void main(String[] args) 
    {
        Scanner fod = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int ip = fod.nextInt();
            
        while (ip!=0) 
        {
            int rem = lastDigit(ip);
            System.out.println("Factorial of "+rem+"  is: "+factorial(rem));
            ip/=10;
        }
        fod.close();
    }
    
    public static int lastDigit(int num)
    {
        return num%10;
    }

    public static int factorial(int num )
    {
        int product =1;
        for (int i=num; i>=1; i--) 
        {
            product *= i;    
        }
        return product;
    }
}
