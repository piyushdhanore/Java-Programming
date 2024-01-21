import java.util.Scanner;
public class AutomorphicNumber 
{
    public static void main(String[] args) 
    {
        Scanner an = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int ip = an.nextInt();
        int den = power(10,count(ip));
        if ((ip*ip)%den==ip)
        {
           System.out.println("it is an automorphic number"); 
        } 
        else 
        {
            System.out.println("it is not an automorphic number");
        }
        an.close();
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

    public static int power(int base, int raise)
    {
        int power = 1;
        for (int i = 0; i < raise; i++) 
        {
            power = power * base;    
        }
        return power;
    }
}
