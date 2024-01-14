public class Calculator 
{
    public static void main(String[] args) 
    {
        add(21,12);
        add(6,23);
        subtract(43,20);
        subtract(567,230);
        divide(56.0,20.0);
    }
    public static void add(int num1, int num2)
    {
        int result = num1+num2;
        System.out.println("Addition of "+num1+" and "+num2+" is: "+result);
    }
    public static void subtract(int num1, int num2)
    {
        int result = num1-num2;
        System.out.println("Subtraction of "+num1+" and "+num2+" is: "+result);
    }
    public static void divide(double num1, double num2)
    {
        double result = num1/num2;
        System.out.println("Division of "+num1+" and "+num2+" is: "+result);
    }
}

