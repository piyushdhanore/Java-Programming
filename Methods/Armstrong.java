import java.util.Scanner;
//Armstrong number using methods
class Armstrong
{
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
    public static int power(int base, int raise ) 
    {
        int power= 1;
        for(int i=0;i<raise;i++)
        {
           power*=base; 
        }
        return power;
    }
    public static boolean armstrong(int num)
    {
        int ct = count(num);
        int sum = 0;
        for(int i =num; i!=0; i/=10)
        {
            int rem=i%10;
            sum= sum + power(rem,ct);
        }
        return sum == num;
    }
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in) ;
        System.out.print("Please enter a number: ");      
        int ip = a.nextInt();
        
        if (armstrong(ip)) {
            System.out.println(ip+" is an armstrong number");
        }
        else
        {
            System.out.println(ip+" is not an armstrong number");
        }
        a.close();
    }
}