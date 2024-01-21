public class RotateNumber 
{
    public static void main(String[] args) 
    {
        int ans = rotate(1234);
        System.out.println("Rotation of 1234 is: "+ans);
    }

    public static int rotate(int num)
    {
        int ans =0;
        while (num!=0) 
       {
        int last =num%10;
        int quo= num/10;
        int digit= count(quo);
        ans = last*power(10,digit);
        num/=10;
       }
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
