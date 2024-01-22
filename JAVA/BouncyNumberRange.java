import java.util.Scanner;
public class BouncyNumberRange 
{
    public static void main(String[] args) 
    {
       Scanner b = new Scanner(System.in);
       System.out.print("Enter starting number: ");
       int start = b.nextInt();

       System.out.print("Enter ending number: ");
       int end = b.nextInt();
       for (int i = start; i <=end; i++) 
       {
            int temp = i;
            boolean inc=false, dec=false;
            while (temp>9) 
            {
                int rem1 = temp%10;
                temp/=10;
                int rem2 = temp%10;

                if (rem1>rem2) 
                {
                    inc = true;    
                }
                else if(rem1<rem2)
                {
                    dec = true;
                }
                if (inc && dec) 
                {
                    break;    
                }
            }
            if (inc && dec) 
            {
                 System.out.println(i);
            } 
        }
        b.close();  
    }
}
