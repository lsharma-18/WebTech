import java.util.Scanner;
public class Ques1{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input string 1 ");
        String s1 = s.nextLine();
        System.out.print("Input string 2 ");
        String s2 = s.nextLine();

        // Take a variable value which will store the value after comparing the strings 
        int value = 0; 

        // Beginning with the first iteration of characters in string s1, compare those characters to those in s2 at the same location.
        // Continue if the two characters' values match, otherwise, set the value equal to (str1[i]-str2[i]), and then break.
        for(int i = 0; i < s1.length() && i < s2.length(); ++i)
        {
            int val1 = s1.charAt(i);
            int val2 = s2.charAt(i);
            if(val1!=val2)
            {
                value = val1-val2;
                break;
            }
            else{
                continue;
            }
        }
        // Take value = s1.length()-s2.length() if s2 is a substring of s1 or s1 is a substring of s2.
        if(value == 0 && (s1.length() > s2.length() || s2.length() > s1.length()))
        {
            value = s1.length() - s2.length();
        }
        // Print the value 
        System.out.println("Strings comapared lexicographically return " + value);
    }
}