/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Minilab: <Minilab #7>
Author: <Katy Hochstetler> <36473082>
Description: <In this segment class, I have created mutitple methods for users to create and manipulate the line segment. I have the 
default constructor which sets the first endpoint to (1,1) and the second endpoint to (7,7). I have a 2 parameterized constructor that 
sets two points to the endpoints. I have a method that sets one endpoint as the origin and the other as the other endpoint. I have 
another constructor to set a deep copy. I have a method for displaying the segment information, a method to check if it equals another 
segment, length of the segment, moving the segment, and checking if a point is an endpoint in this segment.>
*/

public class Segment implements SegmentInterface {
    protected Point firstEndpoint;
    protected Point secondEndpoint;

    //------------- constructors
    // default constructor
    public Segment() {
        this.firstEndpoint = new Point(1, 1);
        this.secondEndpoint = new Point(7, 7);
    }

    // 2 parameterized constructor
    public Segment(Point firstPoint, Point secondPoint) {
        if (firstPoint == null || secondPoint == null) {
            throw new IllegalArgumentException("Points cannot be null");
        } else if (firstPoint.equals(secondPoint)) {
            throw new IllegalArgumentException("Points cannot be the same, this segment would have a length of 0.");
        } else {
            this.firstEndpoint = firstPoint;
            this.secondEndpoint = secondPoint;
        }
    }

    // 1 parameterized constructor 
    public Segment(Point endPoint) {
        Point originEndpoint = new Point(0, 0);

        if (endPoint == null) {
            throw new IllegalArgumentException("Points cannot be null");
        } else if (endPoint.equals(originEndpoint)) {
            throw new IllegalArgumentException("Points cannot be the same, this segment would have a length of 0.");
        } else {
            this.firstEndpoint = originEndpoint;
            this.secondEndpoint = endPoint;
        }
    }

    // deep copy constructor 
    public Segment(Segment userSegment) {
        if (userSegment == null) {
            throw new IllegalArgumentException("No segment received");
        } else {
            this.firstEndpoint = new Point(userSegment.firstEndpoint);
            this.secondEndpoint = new Point(userSegment.secondEndpoint);
        }
    }

    // displays information about segment
    public String toString() {
        return "Segment " + firstEndpoint.toString() + " " + secondEndpoint.toString();
    }

    //checks if the segments are equal
    public boolean equals(Object other) {
        boolean equals;
        if (other instanceof Segment) {
            Segment s = (Segment)other;
           if (this.firstEndpoint.equals(s.firstEndpoint) && this.secondEndpoint.equals(s.secondEndpoint)) {
                equals = true;
           } else if (this.firstEndpoint.equals(s.secondEndpoint) && this.secondEndpoint.equals(s.firstEndpoint)) {
                equals = true;
           } else {
                equals = false;
           }
        } else {
            equals = false;
        }
        
        return equals;
    }

    // displays the length of the segment 
    public double length() {
        return this.firstEndpoint.distanceTo(this.secondEndpoint);
    }

    // moves the segment
    public void translate(int xmove, int ymove) {
        firstEndpoint.translate(xmove, ymove);
        secondEndpoint.translate(xmove, ymove);
    }

    // checks if a point is one of the end points in this segment
    public boolean isAnEndpoint(Point p) {
        if (p == null) {
            throw new IllegalArgumentException("No point recieved");
        } else {
            if (p.equals(this.firstEndpoint)) {
                return true;
            } else if (p.equals(this.secondEndpoint)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
