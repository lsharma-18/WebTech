import java.util.Scanner;

public class QueThree {
    
    public static void main(String args[])
    {
        System.out.println("Enter the dividend");
        Scanner scn = new Scanner (System.in);
        int dividend = scn.nextInt();
        System.out.println("Enter the divisor");
        int divisor = scn.nextInt();

        while(divisor == 0)
        {
            System.out.println("Divisor cannot be zero,re-enter the value");
            divisor = scn.nextInt();
        }
        
        scn.close();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + remainder);
    }
}
