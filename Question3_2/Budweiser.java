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
public class Budweiser extends Beer {
    
    public String company;

    public Budweiser(String company, double price) {
        super(price);
        this.company = company;
    }
            
    public String isLight(){
        return "Budweiser is a light alcohol";
    }

    @Override
    public String toString() {
        return super.toString()+" Company: "+company+" "+isLight();
    }
    
    
    
}
