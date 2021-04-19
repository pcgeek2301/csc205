/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Minilab: <Minilab #7>
Author: <Katy Hochstetler> <36473082>
Description: <>
*/

public class Segment implements SegmentInterface {
    protected Point leftEndpoint;
    protected Point rightEndpoint;

    public Segment() {
        this.leftEndpoint = new Point(1, 1);
        this.rightEndpoint = new Point(7, 7);
    }

    public Segment(Point leftPoint, Point rightPoint) {
        if (leftPoint == null || rightPoint == null) {
            throw new IllegalArgumentException("Points cannot be null");
        } else if (leftPoint.equals(rightPoint)) {
            throw new IllegalArgumentException("Points cannot be the same, this segment would have a length of 0.");
        } else {
            this.leftEndpoint = leftPoint;
            this.rightEndpoint = rightPoint;
        }
    }

    public Segment(Point endPoint) {
        Point originEndpoint = new Point(0, 0);

        if (endPoint == null) {
            throw new IllegalArgumentException("Points cannot be null");
        } else if (endPoint.equals(originEndpoint)) {
            throw new IllegalArgumentException("Points cannot be the same, this segment would have a length of 0.");
        } else {
            this.leftEndpoint = originEndpoint;
            this.rightEndpoint = endPoint;
        }
    }

    public Segment(Segment userSegment) {
        if (userSegment == null) {
            throw new IllegalArgumentException("No segment received");
        } else {
            this.leftEndpoint = userSegment.leftEndpoint;
            this.rightEndpoint = userSegment.rightEndpoint;
        }
    }

    public double length() {
        return this.leftEndpoint.distanceTo(this.rightEndpoint);
    }

    public void translate(int xmove, int ymove) {
        leftEndpoint.translate(xmove, ymove);
        rightEndpoint.translate(xmove, ymove);
    }

    public boolean isAnEndpoint(Point p) {
        
        return false;
    }
    
}
