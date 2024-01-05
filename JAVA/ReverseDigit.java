public class ReverseDigit 
{
    public static void main(String[] args) 
    {
        int start = 10;
        int end = 150;
        while (start<=end) 
        {
            for(int i=start; i>0; i/=10)
            {
                int rev = 0;
                rev = rev*10 + i%10;
                System.out.println(rev);
            }
            start++;    
        }    
    }    
}
