import java.util.Scanner;
class SmithNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (smithNumber(sumOfDigits(num), factors(num))) 
        {
           System.out.println(num+ " is a Smith Number");
        }
        else
        {
           System.out.println(num+ " is not a Smith Number");
        }
        sc.close();
        
    }
    public static int sumOfDigits(int num)
    {
        int sum = 0;

        while (num!=0)
        {
           sum = sum + num%10;
           num/=10;     
        }
        return sum;
    }
    public static int factors(int num) 
    {
        int den=2;
        int sum = 0;
        while (den<=num/2) 
        {
            if (num%den==0) 
            {
                sum = sum + den;
            }    
            den++;
        }
        return sum;
    }
    public static boolean smithNumber(int n1, int n2)
    {
        if (n1==n2) 
        {
            return true;
        } else 
        {
            return false;    
        }
    }
    
}
/* A smith number is a composite number whose sum of digits is equal to the sum of digits of its prime factors,excluding 1. it is also known as a joke number. */