/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3_1;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vinay Kumar Paspula - Question 3 Example 1");
        //Widening Type Casting
        int number = 120;
        System.out.println("number in int: " + number);
        double numberInDouble = number;
        System.out.println("number in double: " + numberInDouble);

        //Narrowing Type Casting
        int num = 20;
        double numInDouble = (double) num;
        System.out.println("num in double= " + numInDouble);

    }

}
