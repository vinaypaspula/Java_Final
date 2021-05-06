/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class ComparableCircle extends Circle implements Comparable {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {

        Circle c = (Circle) o;
        if (this.getArea() > c.getArea()) {
            return 1;
        } else if (this.getArea() < c.getArea()) {
            return -1;
        }
        return 0;
    }
}
