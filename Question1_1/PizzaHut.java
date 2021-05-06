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
public class PizzaHut extends Pizza {

    private int quantityOfSmallPizza;
    private int quantityOfMediumPizza;
    private int quantityOfLargePizza;

    public PizzaHut(int quantityOfSmallPizza, int quantityOfMediumPizza, int quantityOfLargePizza) {
        this.quantityOfSmallPizza = quantityOfSmallPizza;
        this.quantityOfMediumPizza = quantityOfMediumPizza;
        this.quantityOfLargePizza = quantityOfLargePizza;
    }

    public int getQuantityOfSmallPizza() {
        return quantityOfSmallPizza;
    }

    public void setQuantityOfSmallPizza(int quantityOfSmallPizza) {
        this.quantityOfSmallPizza = quantityOfSmallPizza;
    }

    public int getQuantityOfMediumPizza() {
        return quantityOfMediumPizza;
    }

    public void setQuantityOfMediumPizza(int quantityOfMediumPizza) {
        this.quantityOfMediumPizza = quantityOfMediumPizza;
    }

    public int getQuantityOfLargePizza() {
        return quantityOfLargePizza;
    }

    public void setQuantityOfLargePizza(int quantityOfLargePizza) {
        this.quantityOfLargePizza = quantityOfLargePizza;
    }

    @Override
    public double calcPriceSmall() {
        return quantityOfSmallPizza * SMALL;
    }

    @Override
    public double calcPriceMedium() {
        return quantityOfMediumPizza * MEDIUM;
    }

    @Override
    public double calcPriceLarge() {
        return quantityOfLargePizza * LARGE;
    }

    public double totalPrice() {
        return calcPriceSmall() + calcPriceMedium() + calcPriceLarge();
    }

    @Override
    public String toString() {
        return "Your Order"
                + "\nSmall Pizza = " + "Quantity: " + quantityOfSmallPizza + " Price="
                + calcPriceSmall()
                + "\nMedium Pizza = " + "Quantity: " + quantityOfMediumPizza + " Price="
                + calcPriceMedium()
                + "\nLarge Pizza = " + "Quantity: " + quantityOfLargePizza + " Price="
                + calcPriceLarge()
                + "\n---------------------------------------"
                + "\nTotal Price = " + totalPrice()
                + "\n-----------------------------------------";
    }

}
