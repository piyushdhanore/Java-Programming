import java.util.Scanner;
public class ImportantNumner 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int ip = in.nextInt();

        while (ip>1) 
        {
            if (ip%2==0) 
            {
                ip/=2;
            } 
            else if (ip%3==0) 
            {
                ip/=3;
            } 
            else if (ip%5==0) 
            {
                ip/=5;
            }
            else
            {
                break;
            }      
        }
        if (ip==2) 
        {
            System.out.println("it is an important number");
        } 
        else 
        {
            System.out.println("it is not an important number");
        }

    }
}
