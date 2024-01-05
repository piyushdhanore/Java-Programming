import java.util.Scanner;
class CoPrimeNumer 
{
    public static void main(String[] args)
    {
        Scanner cp = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = cp.nextInt();
        System.out.println("Enter second number: ");
        int n2 = cp.nextInt();
        if (coPrime(n1,n2))
        {
            System.out.println(n1+" and "+n2+" are co-prime numbers");    
        } 
        else 
        {
            System.out.println(n1+" and "+n2+" are not co-prime numbers");    
        }

        cp.close();
    }

    public static boolean coPrime(int n1, int n2) 
    {
        int small = n1<n2?n1:n2;
        while(true) 
        {
            if (n1%small==0 && n2%small==0) 
            {
                break;    
            }  
            small--;  
        }
        if (small==1) 
        {
            return true;
        } 
        else 
        {
            return false;    
        }
    }
}
