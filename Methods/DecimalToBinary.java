public class DecimalToBinary 
{
    /*public static void main(String[] args) 
    {
        int num = 10;
        String bin = " ";
        while (num>0) 
        {
            int rem = num%2;
            bin = rem + bin;
            num/=2;
        }
        System.out.println(bin);
    }
    with using strings
    */
    public static void main(String[] args) 
    {
        int num=10;
        int binary = 0;
        int i = 0;
        while (num>0) 
        {
            int rem = num%2;
            binary = binary + rem*power(10,i++);
            num/=2;
        }
        System.out.println(binary);
    }

    public static int power(int base, int raise)
    {
        int power = 1;
        for (int i = 0; i < raise; i++) 
        {
           power *= base; 
        }
        return power;
    }
}
