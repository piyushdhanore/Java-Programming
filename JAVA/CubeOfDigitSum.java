import java.util.Scanner;
public class CubeOfDigitSum 
{
    public static void main(String[] args) 
    {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = c.nextInt();
        int sum=0;
        while(num>0)
        {
            int power = 1;
            int rem = num%10;
            for(int i=0; i<3; i++)
            {
                power = power*rem;
            }
            sum=sum+power;
            num/=10;
        }
        System.out.println("Sum of cube of digit is: "+sum);
    }      
}
