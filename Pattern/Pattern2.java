public class Pattern2 
{
    public static void main(String[]args)
    {
        char ch = 'a';
        for(int i = 0; i<5; i++)
        {
            for(int j=0; j<5;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
    }    
}
