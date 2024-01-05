import java.util.Scanner;
public class PrintAsciiValue 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charcater: ");
        char c = sc.next().charAt(0);
        chara(c);
        sc.close();
    }
    public static void chara(int i)
    {
        System.out.println(i);
    }
}
