/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1_1;

import java.util.Scanner;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class FoodCourt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vinay Kumar Paspula - Question 1 Example 1 \n");
        Scanner scan = new Scanner(System.in);
        int fries = 0;
        int chickenBurger = 0;
        int cheeseBurger = 0;
        int smallPizza = 0;
        int mediumPizza = 0;
        int LargePizza = 0;

        System.out.println("Welcome to the Food Court");
        System.out.println("-----------------------------");
        System.out.print("Would you like to go to BurgerHut or PizzaHut?(B/P): ");
        String bPH = scan.next();
        if (bPH.equalsIgnoreCase("B")) {
            System.out.println("WELCOME TO BURGER HUT");
            System.out.print("Would you like to order Fries ($1.50) (Y/N): ");
            String f = scan.next();
            if (f.equalsIgnoreCase("Y")) {
                System.out.print("Enter the Quantity: ");
                fries = scan.nextInt();
            } else if (f.equalsIgnoreCase("N")) {
                System.out.println("Okay");
            } else {
                System.out.println("Sorry i did not understand that so i will"
                        + " take that as a no ");
            }
            System.out.print("Would you like to order Chicken Burgers ($4.00)(Y/N): ");
            String c = scan.next();
            if (c.equalsIgnoreCase("Y")) {
                System.out.print("Enter the Quantity: ");
                chickenBurger = scan.nextInt();
            } else if (c.equalsIgnoreCase("N")) {
                System.out.println("Okay");
            } else {
                System.out.println("Sorry i did not understand that so i will"
                        + " take that as a no ");
            }
            System.out.print("Would you like to order Cheese Burger ($5.00) (Y/N): ");
            String ch = scan.next();
            if (ch.equalsIgnoreCase("Y")) {
                System.out.print("Enter the Quantity: ");
                cheeseBurger = scan.nextInt();
            } else if (ch.equalsIgnoreCase("N")) {
                System.out.println("Okay");
            } else {
                System.out.println("Sorry i did not understand that so i will"
                        + "take that as a no ");
            }
            BurgerHut bh = new BurgerHut(fries, chickenBurger, cheeseBurger);
            System.out.println("-------------------------------------------");
            if (fries > 0 || chickenBurger > 0 || cheeseBurger > 0) {
                System.out.println(bh);
            } else {
                System.out.println("Thank you for visting");
            }
        } else if (bPH.equalsIgnoreCase("P")) {
            System.out.println("WELCOME TO PIZZA HUT");
            System.out.print("Would you like to order some small pizzas ($2.00)"
                    + " (Y/N): ");
            String sp = scan.next();
            if (sp.equalsIgnoreCase("Y")) {
                System.out.print("Enter the Quantity: ");
                smallPizza = scan.nextInt();
            } else if (sp.equalsIgnoreCase("N")) {
                System.out.println("Okay");
            } else {
                System.out.println("Sorry i did not understand that so i will"
                        + " take that as a no ");
            }
            System.out.print("Would you like to order some medium pizzas ($4.00)"
                    + " (Y/N): ");
            String mp = scan.next();
            if (mp.equalsIgnoreCase("Y")) {
                System.out.print("Enter the Quantity: ");
                mediumPizza = scan.nextInt();
            } else if (mp.equalsIgnoreCase("N")) {
                System.out.println("Okay");
            } else {
                System.out.println("Sorry i did not understand that so i will"
                        + "take that as a no ");
            }
            System.out.print("Would you like to order some large pizzas ($8.00)"
                    + " (Y/N): ");
            String lp = scan.next();
            if (lp.equalsIgnoreCase("Y")) {
                System.out.print("Enter the Quantity: ");
                LargePizza = scan.nextInt();
            } else if (lp.equalsIgnoreCase("N")) {
                System.out.println("Okay");
            } else {
                System.out.println("Sorry i did not understand that so i will"
                        + "take that as a no ");
            }
            PizzaHut ph = new PizzaHut(smallPizza, mediumPizza, LargePizza);
            System.out.println("--------------------------------------------");
            if (smallPizza > 0 || mediumPizza > 0 || LargePizza > 0) {
                System.out.println(ph);
            } else {
                System.out.println("Thank you for visiting");
            }
        } else {
            System.out.println("Please try again with inputs as B - for Burger Hut"
                    + "or P - for Pizza Hut");

        }

    }

}
