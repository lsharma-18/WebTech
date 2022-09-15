import java.util.Scanner;

public class QueFour {

    public static void main (String[] str){

        System.out.println("Enter first number");
        Scanner scn = new Scanner (System.in);
        int num1 = scn.nextInt();
        System.out.println("Enter second number");
        int num2 = scn.nextInt();
        scn.close();

        //storing values to be used for swap without temporary variable
        int number1 = num1;
        int number2 = num2;

        //using temporary variable
        int temp = num2;
        num2 = num1;
        num1 = temp;

        System.out.println("The first number after swap using a temporary variable is " + num1 + " and the second number is " + num2);

        //without using temporary variable
        int sum = number1 + number2; 
        number1 = sum - number1;
        number2 = sum - number1;

        System.out.println("The first number after swap without using a temporary variable is " + number1 + " and the second number is " + number2);

    }
}
