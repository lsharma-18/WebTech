import java.util.Scanner;
import java.util.Arrays;
public class Ques3 {
    public static void main(String[] args)
    {
        // Take the string input 
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string ");
        String input= sc.nextLine();

        
        char[] array = input.toCharArray();
        Arrays.sort(array);
        input = new String(array);
        System.out.println("Sorted string is " + input);

        sc.close();
    }
}