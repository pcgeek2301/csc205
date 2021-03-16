package Minilab_5;

import java.lang.Math;

/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Minilab: <Minilab #5>
Author: <Katy Hochstetler> <36473082>
Description: <In this mini lab I have created a point class that implements the point interface. It can create the point,
return the point as a string, return the distance between two points, return whether the point is equal to another object, check if the 
point is in a particular quadrant, translate the point, and checks if the point is on the x axis or on the y axis 
*/

public class Point implements PointInterface {
    private int x;
    private int y;

    //---------------constructors 
    // default constructor 
    public Point() {
        this.x = 2;
        this.y = -7; 
    }

    // parameterized constructor 
    public Point(int userX, int userY) {
        this.x = userX; 
        this.y = userY;
    }

    // deep copy constructor 
    public Point(Point userPoint) {
        if (userPoint == null) {
            throw new IllegalArgumentException("No point received");
        } else {
            this.x = userPoint.x;
            this.y = userPoint.y;
        }
    }

    // prints the point 
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // uses the distance formula to find distance between two points -> d = sqrt((x2-x1)^2 + (y2 - y1)^2)
    public double distanceTo(Point otherPoint) {
        double distX; 
        double distY;
        double distance; 
        
        if (otherPoint == null) {
            throw new IllegalArgumentException("Other point is null");
        } else {
            distX = otherPoint.x - x; 
            distY = otherPoint.y - y; 

            distance = Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
        }
        
        return distance;
    }

    // checks if the object is a point and then sees if the point is equal to the user point
    public boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Point) {
            Point p = (Point)obj;
           if (this.x == p.x && this.y == p.y) {
               equals = true;
           } else {
               equals = false;
           }
        } else {
            equals = false;
        }
        
        return equals;
    }

    // checks if it is in the quadrant 
    public boolean inQuadrant(int quadrant) {
        boolean inQuadrant = false;

        switch (quadrant) {
            case 1: 
                if (x > 0 && y > 0) {
                    inQuadrant = true;
                } else {
                    inQuadrant = false;
                }
                break;
            case 2:
                if (x < 0 && y > 0) {
                    inQuadrant = true;
                } else {
                    inQuadrant = false;
                }
                break;
            case 3: 
                if (x < 0 && y < 0) {
                    inQuadrant = true;
                } else {
                    inQuadrant = false;
                }        
                break;
            case 4: 
                if (x > 0 && y < 0) {
                    inQuadrant = true;
                } else {
                    inQuadrant = false;
                }
                break;
            default:
                if (quadrant < 1 || quadrant > 4) {
                    throw new IllegalArgumentException("Quadrants are only 1-4");
                }
                break;
        }

        return inQuadrant;
    }
    
    // moves the point
    public void translate(int xMove, int yMove) {
        x += xMove;
        y += yMove;
    }

    // checks if the point is on the x axis 
    public boolean onXAxis() {
        
        return this.y == 0;
    }

    // checks if the point is on the y axis 
    public boolean onYAxis() {

        return this.x == 0;
    }
}
