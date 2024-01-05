import java.util.Scanner;
class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner p =new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = p.nextInt(); 
        int n1 = reverse(num);
        if (palindrome(num,n1)) 
        {
            System.out.println(num+" is a palindrome number");    
        } 
        else 
        {
            System.out.println(num+" is not a palindrome number");    
        }
        p.close();
    }
    public static int reverse(int n)
    {
        int sum = 0;
        while (n>0) 
        {
            int rem = n%10;
            sum = sum*10 + rem;
            n/=10;
        }
            return sum;    
    } 
    public static boolean palindrome(int p1, int p2) 
    {
        if (p1==p2)
        {
            return true;    
        } 
        else 
        {
           return false;  
        }
    }
}
