/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9_1;

/**
 *
 * @author Vinay Kumar Paspula
 */
class ThrowExp {

    static void vote(int age) {
        if (age < 18) {
            throw new ArithmeticException("You must be at least 18 years old to vote");
        } else {
            System.out.println("You can vote your favorite leader");
        }
    }

    public static void main(String[] args) {
        System.out.println("Vinay Kumar Paspula - Question 9 Example 1\n");

        vote(17);
    }
}
