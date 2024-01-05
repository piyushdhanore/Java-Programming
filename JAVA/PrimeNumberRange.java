public class PrimeNumberRange 
{
    public static void main(String[] args) 
    {
        int start = 100; 
        int end = 500;
        
        while (start<=end) 
        {
            int i =2;
            for( ; i<start; i++ )
            {
                if (start%i==0) 
                {
                    break;    
                }
            }
            if (i==start) 
            {
                System.out.println(start);    
            }
            start++;  
        }      

    }    
}
