/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3_2;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class BeerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        System.out.println("Vinay Kumar Paspula - Question 3 Example 2\n");
        Beer b= new Beer(20);
        System.out.println(b);
        Budweiser bb= new Budweiser("Walmart", 25);
        System.out.println(bb);
        Beer b1= (Beer) bb;
        System.out.println(b1);
        
    }
    
}
