import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = scn.nextInt();
        scn.close();
        System.out.println("Hailstone Sequence for "+ n + " is");
        System.out.println(n);

        // While n is greater than 1, determine if it is even. If so, cut it by half; otherwise, increase it by three and adding one.
        // At each iteration, print n 

        while(n != 1)
        {
            if(n % 2 == 0)
            {
                n = n/2;
            }
            else{
                n = (3 * n) + 1;
            }
            System.out.println(n);
        }
    }
}