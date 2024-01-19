import java.util.Scanner;
public class TernaryEvenOdd 
{
    public static void main(String[] args) 
    {
        Scanner teo = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int ip = teo.nextInt();
        boolean res = evenOdd(ip);
        if (res) 
        {
            System.out.println(ip+" is even");
        } 
        else 
        {
            System.out.println(ip+" is odd");
        }
        teo.close();
        
    }

    public static boolean evenOdd(int num)
    {
        return num%2==0?true:false;
    }
}
