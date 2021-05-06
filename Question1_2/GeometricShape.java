/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1_2;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class GeometricShape implements Triangle, Rectangle {

    private double baseOfTriangle;
    private double heightOfTriangle;
    private double side1;
    private double side2;
    private double side3;
    private double lengthOfRectangle;
    private double breadthOfRectangle;

    public GeometricShape(double baseOfTriangle, double heightOfTriangle, double side1, double side2, double side3, double lengthOfRectangle, double breadthOfRectangle) {
        this.baseOfTriangle = baseOfTriangle;
        this.heightOfTriangle = heightOfTriangle;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.lengthOfRectangle = lengthOfRectangle;
        this.breadthOfRectangle = breadthOfRectangle;
    }

    public double getBaseOfTriangle() {
        return baseOfTriangle;
    }

    public void setBaseOfTriangle(double baseOfTriangle) {
        this.baseOfTriangle = baseOfTriangle;
    }

    public double getHeightOfTriangle() {
        return heightOfTriangle;
    }

    public void setHeightOfTriangle(double heightOfTriangle) {
        this.heightOfTriangle = heightOfTriangle;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getLengthOfRectangle() {
        return lengthOfRectangle;
    }

    public void setLengthOfRectangle(double lengthOfRectangle) {
        this.lengthOfRectangle = lengthOfRectangle;
    }

    public double getBreadthOfRectangle() {
        return breadthOfRectangle;
    }

    public void setBreadthOfRectangle(double breadthOfRectangle) {
        this.breadthOfRectangle = breadthOfRectangle;
    }

    @Override
    public double traingleArea() {
        return 0.5 * baseOfTriangle * heightOfTriangle;
    }

    @Override
    public double trianglePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double rectangleArea() {
        return lengthOfRectangle * breadthOfRectangle;
    }

    @Override
    public double rectanglePerimeter() {
        return 2 * (lengthOfRectangle + breadthOfRectangle);
    }

    @Override
    public String toString() {
        return "GeometricShape"
                + "\nBase Of Triangle = " + baseOfTriangle
                + "\nHeight Of Triangle = " + heightOfTriangle
                + "\nSide1 Of Triangle = " + side1
                + "\nSide2 Of Triangle = " + side2
                + "\nSide3 Of Triangle = " + side3
                + "\nLength Of Rectangle = " + lengthOfRectangle
                + "\nBreadth Of Rectangle = " + breadthOfRectangle
                + "\nArea of Triangle = " + traingleArea()
                + "\nPerimeter of Triangle = " + trianglePerimeter()
                + "\nArea of Rectangle = " + rectangleArea()
                + "\nPerimeter of Rectangle = " + rectanglePerimeter();
    }

}
