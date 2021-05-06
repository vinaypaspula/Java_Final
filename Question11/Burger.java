/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

//Importing objects package
import java.util.Objects;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class Burger {
    //Declaring three private instances called as type, name and price of type String, String and double.
    private String type;
    private String name;
    private double price;

    //Constructor with three parameters called type,name and price
    public Burger(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }
    
    //Getter method to get the type which is of type String
    public String getType() {
        return type;
    }
    
    //Setter method to set the type which is of type String
    public void setType(String type) {
        this.type = type;
    }

    //Getter method to get the name which is of type String
    public String getName() {
        return name;
    }
    
    //Setter method to set the name which is of type String
    public void setName(String name) {
        this.name = name;
    }
    
    //Getter method to get the price which is of type double
    public double getPrice() {
        return price;
    }

    //Setter method to set the price which is of type double
    public void setPrice(double price) {
        this.price = price;
    }
    
    //To string method which return the type,name and price.
    @Override
    public String toString() {
        return "Burger{" + "type=" + type + ", name=" + name + ", price=" + price + '}';
    }
    
    //Hashcode and equals method of type int and boolean to give paramaters on which we should compare the two objects
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Burger other = (Burger) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

}
