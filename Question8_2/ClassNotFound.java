/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8_2;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class ClassNotFound {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        System.out.println("Vinay Kumar Paspula - Question 8 Example 2\n");
        Class.forName("RandomClass");

    }

}
