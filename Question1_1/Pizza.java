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
public abstract class Pizza {

    public static final double SMALL = 2;
    public static final double MEDIUM = 4;
    public static final double LARGE = 8;

    public abstract double calcPriceSmall();

    public abstract double calcPriceMedium();

    public abstract double calcPriceLarge();

}
