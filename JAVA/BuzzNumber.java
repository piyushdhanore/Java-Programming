import java.util.Scanner;
public class BuzzNumber 
{
    public static void main(String[] args) 
    {
        Scanner b = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int num = b.nextInt();
        
        if (num%10==7 || num%7==0) 
        {
            System.out.println(num+" is a buzz number.");
        }
        else
        {
            System.out.println(num+" is not a buzz number");
        }
        b.close();
    }
}
/*
 Buzz Number: the numbers that are divisibl by seven or ends with seven.
 */
