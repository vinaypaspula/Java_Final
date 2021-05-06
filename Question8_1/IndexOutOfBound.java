/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8_1;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class IndexOutOfBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IndexOutOfBoundsException {
        // TODO code application logic here
        System.out.println("Vinay Kumar Paspula - Question 8 Example 1\n");
        String greet="Have a nice day";
        
        try{
            greet.charAt(40);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
}
