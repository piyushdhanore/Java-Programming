import java.util.Scanner;
public class DisariumNumber 
{
    public static void main(String[] args) 
    {
        Scanner d = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = d.nextInt();
        int temp = num;
        int count = 0, sum = 0;
        for(int i =num; i>0; i/=10)
        {
            count++;  
        }

        for(int i = num; i>0; i/=10)
        {
            int rem = i%10;
            int power = 1;
            for(int j=0; j<count; j++)
            {
                power = power*rem;
            }
            sum = sum+power;
            count--;
        }
        if (sum==num) 
        {
            System.out.println(temp+" is a disarium number");
        } 
        else 
        {
            System.out.println(temp+" is not a disarium number");   
        }

    }
}
/*
Disarium number: sum of its digits powered with their respective position is equal to the original number
 Disarium number is also called as unhappy number.
 */
