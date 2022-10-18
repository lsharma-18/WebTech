import java.util.Scanner;

public class Ques2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // To hold the count of each number in array arr, create a count array of size 21 (because the array numbers are in the range 0–20).
        int count[] = new int[21];

        // Take the numbers in array as input from user and parallely keep a count of each number in count array
        System.out.println("Enter the numbers in the array ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            ++count[arr[i]];
        }

        // Take the user-provided integers in the array and keep a parallel count of each one in the count array.
        for (int i = 1; i < 21; i++) {
            count[i] += count[i - 1];
        }


        int k = size - 1;
        int sortedarray[] = new int[size]; // For storing the sorted array

        // Iterate array arr and copy element I to count[arr[k]]-1 where it belongs in accordance with count array in sorted array.
        // Reducing the count by one when each element has been properly positioned.

        while (k >= 0) {
            sortedarray[count[arr[k]] - 1] = arr[k];
            count[arr[k]] -= 1;
            k -= 1;
        }

        // Print the sorted array 
        System.out.println("The sorted array is ");

        for (int i = 0; i < size; i++) {
            System.out.println(sortedarray[i]);
        }

        sc.close();

    }
}
