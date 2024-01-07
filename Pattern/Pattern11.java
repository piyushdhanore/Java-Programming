public class Pattern11 
{
    public static void main(String[] args) 
    {
        for(int i=5; i>0; i--)
        {
            for (int j=5; j>0; j--) 
            {
                if (j>5-i) 
                {
                    System.out.print("*"+" ");
                } 
                else 
                {
                    System.out.print(" "+" ");                    
                }    
            }
            System.out.println();
        }    
    }    
}
