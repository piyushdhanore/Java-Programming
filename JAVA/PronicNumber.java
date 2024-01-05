public class PronicNumber 
{
    public static void main(String[] args) 
    {
        
        int num = 8;
        int res = 0;
        for(int i =1; res<=num;)
        {
          res = i*++i;
          if (res==num) 
          {
            break;
          }
        }   
        if(res==num)
        {
            System.out.println("It is a pronic number"); 

        }  
        else
        {
            System.out.println("It is not a pronic number");
  

        }
    }    
}
/*Pronic Number: A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n+1).
 */
