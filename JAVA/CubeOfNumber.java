import java.util.Scanner;
public class CubeOfNumber
{
    public static void main(String[] args) 
    {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = c.nextInt();
            int power = 1;
            for(int i =0; i<3; i++)
            {
                power = power*num;
            }  

        System.out.println("cube of "+num+" is "+power);    
        c.close();
    }
        
}
