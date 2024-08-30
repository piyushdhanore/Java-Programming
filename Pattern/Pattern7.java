public class Pattern7 
{
    public static void main(String[] args) 
    {
        int n=7;
        for(int i=0; i<7; i++)
        {
            for(int j=0;j<n-i;j++)
            // or j+i<n;
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }    
}
