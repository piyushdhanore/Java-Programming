public class Pattern2
{
    public static void main(String[] args) 
    {
        printTriangle(10);
    }
    public static void printTriangle(int num)
    {
        for (int i = 0; i < num; i++) 
        {
            for (int j = 0; j<num; j++) 
            {
                if (i==j || j==0 || i==(num-1)) 
                {
                    System.out.print("*"+" "); 
                } else 
                {
                    System.out.print(" "+" ");
                }     
            }
            System.out.println();
        }
    }
}
