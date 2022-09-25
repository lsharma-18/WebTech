import java.util.Scanner;

public class Ques1 {

    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        double score = scn.nextDouble();
        scn.close();

        if(score > 80 && score < 90)
            score += 5;
        
        System.out.println("Score is " + score);
    }
}