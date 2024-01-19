import java.util.Scanner;
public class Pattern1 
{
    public static void main(String[] args) 
    {
        Scanner p1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = p1.nextInt();
        printSquare(num);    
    }

    public static void printSquare(int num)
    {
        for (int i = 0; i < num; i++) 
        {
            for (int j = 0; j < num; j++) 
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
