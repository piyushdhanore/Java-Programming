public class BinaryToDecimal 
{
    public static void main(String[] args) 
    {
        int bin = 1010;
        int i =0;
        int dec =0;
        while (bin!=0) 
        {
            int rem = bin%10;
            dec = dec + rem*power(2,i++);
            bin/=10;
        }
        System.out.println(dec);
    }

    public static int power(int base, int raise)
    {
        int power = 1;
        for (int i = 0; i < raise; i++) 
        {
            power *=base;
        }
        return power;
    }
}
