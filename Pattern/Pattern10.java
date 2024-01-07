import java.util.Scanner;
public class Pattern10 
{
    public static void main(String[] args) 
    {
        Scanner p =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = p.nextInt();
        for (int i = 0; i<n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
               if (j<n-1-i) 
               {
                    System.out.print(" "+" ");
               } 
               else 
               {
                    System.out.print("*"+" ");                
               } 
            }
            System.out.println();
        }
    }    
}
