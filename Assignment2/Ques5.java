import java.util.Scanner;

public class Ques5 {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = scn.nextInt();

        //n has to be greater than 1
        while(n < 1)
        {
            System.out.println("Please enter valid values");
            n = scn.nextInt();
        }

        scn.close();

        System.out.println("n n^2 n^3 n^4");

        for(int i = 1; i <= n; ++i)
        {
            int count = 0,  //to count the powers calculated 
            temp = i;       // holds the value of latest power

            while(count < 4)
            {
                System.out.print(temp + "  ");
                temp *= i;
                ++count;
            }

            System.out.println();
        }
    }
}
