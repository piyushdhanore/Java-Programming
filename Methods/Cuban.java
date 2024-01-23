public class Cuban 
{
    public static void main(String[] args) 
    {
        int n =100;
        for (int i = 1; i < n; i++) 
        {
            if (checkCubanPrime(i)) 
            {
                System.out.println(cubanFormula(i));
            }
        }
    }

    public  static boolean checkCubanPrime(int num)
    {
        int cubanNo = cubanFormula(num);
        if (isPrime(cubanNo)) 
        {
            return true;
        }
        return false;
    }
    public static int cube(int n)
    {
        return n*n*n;
    }

    public static boolean isPrime(int num)
    {
        int deno =2;
        for (int i = deno; i < num; i++) 
        {
            if (num%i==0) 
            {
                return false;
            }
        }
        return true;
    }

    public static int cubanFormula(int n)
    {
        return cube(n+1)-cube(n);
    }
}
