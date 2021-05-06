/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class OutOfBound {

    public static void main(String[] args) {

        System.out.println("Vinay Kumar Paspula - Question 7\n");

        Scanner input = new Scanner(System.in);
        int[] a = new int[100];
        int i = 0;
        while (i < a.length) {
            a[i] = (int) (Math.random() * 100) + 1;
            i++;
        }

        System.out.print("Enter the index of the array: ");
        try {
            System.out.println("The corresponding element value is "
                    + a[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds.");
        }
    }

}
