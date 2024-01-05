import java.util.Scanner;
public class Hcf 
{        
    public static void main(String[] args) 
        {
            Scanner h = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int n1 = h.nextInt();
            
            System.out.println("Enter second number: ");
            int n2 = h.nextInt();

            int small = n1<n2? n1:n2;

            while (true) 
            {
                if (n1%small==0 && n2%small==0) 
                {
                    System.out.println("Hcf of "+n1+ " and "+n2+" is "+small);
                    break;    
                }  
                small--;  
            }

        }
}
