import java.util.Scanner;
class CubanPrime
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n ;i++ )
		{
			if(isCubanPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	public static int cube(int num)
	{
		return num*num*num;
	}
	public static int cubanFormula(int num)
	{
		return cube(num+1)-cube(num);
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		for(int i= den;i<num ;i++ )
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isCubanPrime(int num)
	{
		int cubno=cubanFormula(num);
		if(isPrime(cubno))
		{
			return true;
		}
		return false;
	}
}