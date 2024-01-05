import java.util.Scanner;
class DuckNumber 
{
    public static void main(String[] args) 
    {
        Scanner d =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = d.nextInt();
        while (num>0) 
        {
            int rem = num%10;
            if (rem==0) 
            {
                break;    
            }   
            num/=10;
        }
        if (num==0) 
        {
            System.out.println("It is not a duck number");
        } 
        else 
        {
            System.out.println("It is a duck number");
        }
    }
}
