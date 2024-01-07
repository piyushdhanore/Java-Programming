import java.util.Scanner;
public class Pattern14 
{
    public static void main(String[] args) 
    {
        Scanner p =new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = p.nextInt();
        int star=1, space=n/2;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < space; j++) 
            {
                System.out.print(" "+" ");    
            } 
            for (int j = 0; j < star; j++) 
            {
                System.out.print("*"+" ");                    
            } 
            if (i<n/2) 
            {
                space--;
                star+=2;
            } 
            else 
            {
                space++;
                star-=2;
            } 
            System.out.println();
            p.close(); 
        }
    }    
}
