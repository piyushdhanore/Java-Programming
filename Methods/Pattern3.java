public class Pattern3
{
    public static void main(String[] args) 
    {
        printPyramid(9);
    }
    public static void printPyramid(int num)
    {
        for (int i = 0; i < num; i++) 
        {
            for (int space = 0; space < num-1-i; space++) 
            {
                System.out.print(" "+" "); 
            }
            for (int star = 0;star<2*i+1; star++) 
            {
                System.out.print("*"+" ");    
            }
            System.out.println();
        }
    }
}
