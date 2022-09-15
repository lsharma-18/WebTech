import java.util.Scanner;
import java.lang.Math;

public class QueOne {

    public static void main (String[] args)
    {
        System.out.println("Enter two numbers");
        Scanner scn = new Scanner (System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        scn.close();

        //Addition
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        //Subtraction
        int difference = Math.abs(num2 - num1);
        System.out.println("The difference between " + num1 + " and " + num2 + " is " + difference);

    }
}