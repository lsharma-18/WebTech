package Assignment4;

import java.util.*;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the vector");
        int size = sc.nextInt();

        Vector v = new Vector(size);
        int capacity = v.capacity();
        String str = sc.nextLine();
        v.add(str);

        while(v.size() <= capacity) {
            str = sc.nextLine();

            if(str == "") {
                break;
            }

            v.add(str);
        }

        if(v.size() != 0) {
            v.remove(0);
        }

        System.out.println(v.toString());
  }
    
}
