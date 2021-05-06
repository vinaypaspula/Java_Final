/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10_2;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class FibonacciSeriesInfiniteRecursion {

    public static int n1 = 0;
    public static int n2 = 1;
    public static int n3 = 0;

    public static void printFibonacci(int numberTill) {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        System.out.print(" " + n3);
        printFibonacci(numberTill - 1);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Vinay Kumar Paspula - Question 10 Example 2\n");
        // TODO code application logic here
        int numberTill = 19;
        System.out.print(n1 + " " + n2);
        printFibonacci(numberTill);
    }
}
