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
public class BurgerHut extends Burger {

    private int quantityOfFries;
    private int quantityOfChickedBurger;
    private int quantityOfCheeseBurger;

    public BurgerHut(int quantityOfFries, int quantityOfChickedBurger, int quantityOfCheeseBurger) {
        this.quantityOfFries = quantityOfFries;
        this.quantityOfChickedBurger = quantityOfChickedBurger;
        this.quantityOfCheeseBurger = quantityOfCheeseBurger;
    }

    public int getQuantityOfFries() {
        return quantityOfFries;
    }

    public void setQuantityOfFries(int quantityOfFries) {
        this.quantityOfFries = quantityOfFries;
    }

    public int getQuantityOfChickedBurger() {
        return quantityOfChickedBurger;
    }

    public void setQuantityOfChickedBurger(int quantityOfChickedBurger) {
        this.quantityOfChickedBurger = quantityOfChickedBurger;
    }

    public int getQuantityOfCheeseBurger() {
        return quantityOfCheeseBurger;
    }

    public void setQuantityOfCheeseBurger(int quantityOfCheeseBurger) {
        this.quantityOfCheeseBurger = quantityOfCheeseBurger;
    }

    @Override
    public double calcPriceFries() {
        return quantityOfFries * FRIES;
    }

    @Override
    public double calcPriceCB() {
        return quantityOfChickedBurger * CHICKENBURGER;
    }

    @Override
    public double calcPriceCHB() {
        return quantityOfCheeseBurger * CHEESEBURGER;
    }

    public double totalPrice() {
        return calcPriceFries() + calcPriceCHB() + calcPriceCB();
    }

    @Override
    public String toString() {
        return "You Order:"
                + "\nFries " + "Quantity: " + quantityOfFries + " Price = $"
                + calcPriceFries()
                + "\nChickedBurger " + "Quantity: " + quantityOfChickedBurger + " Price = $"
                + quantityOfChickedBurger
                + "\nCheeseBurger " + "Quantity: " + quantityOfCheeseBurger + " Price= $"
                + quantityOfCheeseBurger
                + "\n------------------------------------"
                + "\nTotal Price = $" + totalPrice()
                + "\n------------------------------------";
    }

}
