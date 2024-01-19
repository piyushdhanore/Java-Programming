import java.util.Scanner;
public class TechNumber 
{
    public static void main(String[] args) 
    {
        Scanner tech = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int ip = tech.nextInt();

        int digitCount=count(ip);

        if (digitCount%2==0) 
        {
            int den = power(10,digitCount/2);
            int lastHalf = ip%den;
            int firstHalf = ip/den;
            int sum = firstHalf + lastHalf;
            if (sum*sum==ip) 
            {
                System.out.println("It is a tech number");    
            } 
            else 
            {
                System.out.println("it is not a tech number");    
            }
        } 
        else 
        {
            System.out.println("it is not a tech number");
        }
        tech.close();
    }

    public static int power(int base, int raise)
    {
        int power=1;
        for (int i = 0; i < raise; i++) 
        {
           power *= base; 
        }
        return power;
    }

    public static int count(int num)
    {
        int count = 0;
        while (num!=0) 
        {
            count++;
            num/=10;    
        }
        return count;
    }

}
