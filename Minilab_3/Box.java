package Minilab_3;

/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Minilab: <Minilab #3>
Author: <Katy Hochstetler> <36473082>
Description: <In this mini lab I have created a subclass of Rectangle called Box. Box has a method 
to convert its dimensions to string. Box has a method to get the width which was inherited from 
the rectangle class. The box has a method to get its perimeter which throws an exception because 
3-dimensional objects do not have perimeters. The box has method to get the sum of its dimensions. 
The box has a method to get its surface area.> 
*/
public class Box extends Rectangle {

    protected int depth; 
 
    public Box() {
        super(); 
        this.depth = 6; 
    }

    public Box(int theWidth, int theHeight, int theDepth) {
        super(theWidth, theHeight);

        if (theDepth < 0) {
            throw new IllegalArgumentException("a dimension cannot be negative");
        }

        this.depth = theDepth;
    }

    public String toString() {
        return super.toString() + "x" + depth;
    }
    
    public int getPerimeter() {
        throw new IllegalStateException("Three-dimensional objects do not have a perimeter");
    }
    

    public int getSumOfDimensions() {
        return super.getSumOfDimensions() + this.depth;
    }

    public int getSurfaceArea() {
        return (2 * this.depth * this.width) + (2 * this.depth * this.height) + (2 * this.height * this.width);
    }
}
