import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
       int yr;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Year : ");
       yr = scan.nextInt();
	   
       if((yr%4 == 0) && (yr%100!=0))
       {
           System.out.print("yes");
       }
       else if((yr%100 == 0) && (yr%400 == 0))
       {
           System.out.print("yes");
       }
       else if(yr%400 == 0)
       {
           System.out.print("yes");
       }
       else
       {
           System.out.print("no");
       }
    }
}
