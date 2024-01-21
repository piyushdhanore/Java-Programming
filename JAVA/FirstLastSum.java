public class FirstLastSum 
{
    public static void main(String[] args) 
    {
        int num = 12345;
        int lastSum = num%10;
        int middleSum = 0;
        num/=10;
        while (num>9) 
        {
            middleSum+=num%10;
            num/=10;
        }
        lastSum+=num;
        if (lastSum==middleSum) 
        {
            System.out.println("They are equal");
        } 
        else 
        {
            System.out.println("They are not equal");
        }
    }
}
