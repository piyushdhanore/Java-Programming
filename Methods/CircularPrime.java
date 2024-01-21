import java.util.Scanner;
public class CircularPrime 
{
    public static void main(String[] args)
    {
        Scanner cp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int ip = cp.nextInt();
        int temp = ip;
        if (isPrime(ip)) 
        {
            ip = rotate(ip);
           while (ip!=temp) 
           {
                if (isPrime(ip)) 
                {
                    ip=rotate(ip);    
                } 
                else 
                {
                    break;    
                } 
           } 
            if (ip==temp) 
            {
                System.out.println("Given number is a circular prime");    
            } 
            else 
            {
                System.out.println("Given number is a circular prime");        
            }
        } 
        else 
        {
            System.out.println("it is not a prime number");
        }    
        cp.close();
    }

    public static boolean isPrime(int num)
    {
        int deno = 2;
        for (int i = deno; i < num; i++) 
        {
          if (num%i==0) 
          {
             return false;
          }  
        }
        return true;
    }

    public static int rotate(int num)
    {
        int ans=0;
        while (num>0) 
        {
            int rem = num%10; 
            ans = rem * power(10, count(num)-1); 
            num/=10; 
        }
        return ans;
    }

    public static int count(int num)
    {
        int count = 0;
        while (num>0) 
        {
            count++;
            num/=10;    
        }
        return count;
    }

    public static int power(int base, int raise)
    {
        int power =1;
        for (int i = 0; i < raise; i++) 
        {
            power = power * base;
        }

        return power;
    }
}

