public class Pattern8 
{
    public static void main(String[] args) 
    {
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5-i; j++)
            {
                if (i==0 || j==0 || j==5-i-1) 
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
