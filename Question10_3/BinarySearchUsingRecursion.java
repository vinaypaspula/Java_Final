package Question10_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class BinarySearchUsingRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vinay Kumar Paspula - Question 10 Example 3\n");
        String answer = "Y";
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> Array = new ArrayList<>();
        do {
            System.out.print("Enter a number to be added to the Array List: ");
            int num = scan.nextInt();
            Array.add(num);
            System.out.print("Would you like to add another number? (Y/N): ");
            answer = scan.next();
        } while (answer.equalsIgnoreCase("Y"));

        Collections.sort(Array);
        System.out.println("List of numbers to search from are:");
        for (int i = 0; i < Array.size(); i++) {
            System.out.print(Array.get(i) + " ");
        }

        System.out.print("\nEnter the number to search : ");
        int x = scan.nextInt();
        scan.close();
        boolean result = binarySearch(Array, 0, Array.size() - 1, x);
        if (result) {
            System.out.println("The number you are looking for is in the list");
        } else {
            System.out.println("The number you are looking for is not in the list");
        }
    }

    public static boolean binarySearch(ArrayList<Integer> li, int x, int y, int z) {
        if (y >= x) {
            int a = x + (y - x) / 2;
            if (li.get(a) == z) {
                return true;
            }
            if (z < li.get(a)) {
                return binarySearch(li, x, a - 1, z);
            } else {
                return binarySearch(li, a + 1, y, z);
            }
        }

        return false;
    }
}
