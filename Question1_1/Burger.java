/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1_1;

/**
 *
 * @author Vinay Kumar Paspula
 */
public abstract class Burger {

    public static final double FRIES = 1.5;
    public static final double CHICKENBURGER = 4;
    public static final double CHEESEBURGER = 5;

    public abstract double calcPriceFries();

    public abstract double calcPriceCB();

    public abstract double calcPriceCHB();

}
