public class MinOfThree {

    public static void main(String[] args){

        int a = 3, b = -1, c = 12;

        //We will compare each number with other two numbers and find the smallest.

        if(a <= b && a <= c)
        {
            System.out.println("The smallest number is " + a);
        }

        else if(b <= a && b <= c)
        {
            System.out.println("The smallest number is " + b);
        }

        else
        {
            System.out.println("The smallest number is " + c);
        }
    }
    
}
