/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class BurgerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vinay Kumar Paspula - Question 11\n");
        
        //Creating objects for the burger class and passing the required parameters
        Burger b1 = new Burger("Chicken", "Whopper", 20);
        Burger b2 = new Burger("Mutton", "McRib", 40);
        Burger b3 = new Burger("Chicken", "Whopper", 25);
        Burger b4 = new Burger("Fish", "Tuna", 45);
        
        //If we were to compare using .equals() method without giving the parameters on which to compare them they all return false because the method doesnot know on which parameters it should compare.
        //Since we declared .equals method in burger class it now has a parameter to compare so since we have given type as a parameter on which to compare it returns true if both are same
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        System.out.println(b1.equals(b4));
        System.out.println(b2.equals(b3));
        System.out.println(b2.equals(b4));
        System.out.println(b3.equals(b4));

        //Since we decalred hashcode in burger class it compares on the references type parameter.
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());
        System.out.println(b4.hashCode());
    }

}
