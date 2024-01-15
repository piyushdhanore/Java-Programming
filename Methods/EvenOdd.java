import java.util.Scanner;
public class EvenOdd 
{
    public static void main(String[] args) 
    {
        Scanner eo = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = eo.nextInt();
        evenOdd(num1);
        eo.close();
    }

    public static void evenOdd(int num)
    {
        if (num%2==0) 
        {
           System.out.println(num+" is an even number"); 
        } 
        else 
        {
            System.out.println(num+" is an odd number");
        }
    }
}
