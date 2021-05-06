/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Vinay Kumar Paspula - Question 2\n");

        GeometricObject[] go = new GeometricObject[5];
        go[0] = new Square(7);
        go[1] = new Square(12);
        go[2] = new Square(6);
        go[3] = new Square(19);
        go[4] = new Square(11);

        for (int i = 0; i < go.length; i++) {
            System.out.println("Area of square " + (i + 1) + " :" + go[i].Area());
            if (go[i] instanceof Colorable) {
                ((Square) go[i]).howToColor();
            }
        }
    }
}
