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
/*
 1) After n, the space should keep on increasing and before n the space should keep on decreasing.
 2) star=1 because the minimum number of star required at the top is 1.
 3) space=n/2 because maximum required space is half of the given number.
 */
