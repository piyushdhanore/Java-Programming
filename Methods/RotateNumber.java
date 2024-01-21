public class RotateNumber 
{
    public static void main(String[] args) 
    {
        int num = 345, ans=0;

        while (num>0) 
        {
            int rem = num%10;
            ans = ans + rem*power(10,count(num)-1);
            num/=10;    
        }
        System.out.println(ans);
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