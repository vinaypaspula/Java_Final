/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9_2;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class Throwsexp {

    static void fun() throws IllegalAccessException {
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        System.out.println("Vinay Kumar Paspula - Question 9 Example 2\n");

        try {
            fun();
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }
    }
}
