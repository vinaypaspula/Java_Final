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
public class Beer {
    double price;

    public Beer(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "price =" + price ;
    }
    
    
}
