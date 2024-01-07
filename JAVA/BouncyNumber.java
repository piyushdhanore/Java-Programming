import java.util.Scanner;
class BouncyNumber
{
    public static void main(String[] args) 
    {
       Scanner b = new Scanner(System.in);
       System.out.print("Enter a 3 digit number: ");
       int num = b.nextInt();
       boolean inc=false, dec=false;
       while (num>9) 
       {
            int rem1 = num%10;
            num/=10;
            int rem2 = num%10;
            
            if (rem1>rem2) 
            {
                inc = true;    
            }
            else if(rem1<rem2)
            {
                dec = true;
            }
            if (inc && dec) 
            {
                break;    
            }
       }
       if (inc && dec) 
       {
            System.out.println("It is a bouncy number");
       } 
       else 
       {
            System.out.println("It is not a bouncy number");
       }
    }
}
