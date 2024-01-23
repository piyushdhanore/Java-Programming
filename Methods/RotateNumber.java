import java.util.Scanner;
public class RotateNumber 
{
    public static void main(String[] args)
    {
        Scanner r = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = r.nextInt();
        System.out.print(rotate(num));
        r.close();
    }
    public static int rotate(int num)
    {
        int last = num%10; 
        num/=10;
        int count = count(num);
        int ans = last * power(10, count) + num; 
        return ans;
    }
    public static int count(int num)
    {
        int count = 0;
        while (num>0) 
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
