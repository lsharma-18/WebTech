import java.util.Scanner;

public class QueTwo {
    
    public static void main(String args[])
    {
        System.out.println("Enter two numbers");
        Scanner scn = new Scanner (System.in);
        float num1 = scn.nextFloat();
        float num2 = scn.nextFloat();
        scn.close();

        double answer = (double)num1 * num2;

        System.out.println("Multiplication is " + answer);
    }
}
