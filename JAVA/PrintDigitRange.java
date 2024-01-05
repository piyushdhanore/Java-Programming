public class PrintDigitRange 
{
    public static void main(String[] args) 
    {
        int start = 100;
        int end = 200;
        for(int i = start; i<=end; i++) 
        {
            int j =i;
            while(j!=0)
            {
                int rem=j%10; 
                System.out.println(rem);
                j/=10;  
            }
        }

    }    
}
