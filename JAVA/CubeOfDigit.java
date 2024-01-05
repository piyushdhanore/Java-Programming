import java.util.Scanner;
public class CubeOfDigit 
{
    public static void main(String[] args) 
    {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = c.nextInt();
        
        while(num>0)
        {
            int power = 1;
            int rem = num%10;
            for(int i=0; i<3; i++)
            {
                power = power*rem;
            }
            System.out.println("cube of "+rem+" is "+power);
            num/=10;
        }
    }       
}
