import java.util.Scanner;
class Lcm 
{
    public static void main(String[] args) 
    {
        int n1 =72, n2 = 120, lcm,multiply =1;

        int large = (n1>n2)?n1:n2;

        while (true) 
        {
            lcm = large*multiply;
            if (lcm%n1==0 && lcm%n2==0) 
            {
                System.out.println(lcm); 
                break;  
            } 
            multiply++;   
        }
    }
}
