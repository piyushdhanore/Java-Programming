import java.util.Scanner;
public class AutomorphicNumber 
{
    public static void main(String[] args) 
    {
        Scanner an = new Scanner(System.in);
        
        an.close();
    }

    public static int count(int num)
    {
        int count = 0;
        while (num!=0) 
        {
            count++;
            num/=10;    
        }
        return count;
    }
}
