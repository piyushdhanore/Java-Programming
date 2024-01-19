import java.util.Scanner;
public class HappyNumber 
{
    public static void main(String[] args) 
    {
        Scanner h = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int ip = h.nextInt();
        int output = isHappy(ip);

        while (true) 
        {
            if (output==1 || output==4) 
            {
                break;
            } 
            else 
            {
                output=isHappy(output);
            }    
        }
        if (output==1) 
        {
            System.out.println("It is a happy number");    
        } 
        else if (output==4) 
        {
            System.out.println("It is a sad number"); 
        }
        h.close();
    }

    public static int isHappy(int num)
    {
        int sum = 0;
        while (num!=0) 
        {
            int rem = num%10;
            sum+=(rem*rem);
            num/=10;    
        }
        return sum;
    }
}
/*
 Happy Number: 
 */