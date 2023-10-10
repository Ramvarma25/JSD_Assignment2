/*
7. Create class point with following instance variable and methods.
Instance variable: int x,y
Constructors: public Point(), Point(int x, int y)
Methods: public void setX(int x), setY(int y), setXY(int x,int y)
Create 2 Point objects and compare if the points are overlapping.
 */

class Point {
    int x, y;

    // Creating Constructors
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // setX & setY Methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // setXY Method
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to check if two points overlap
    public boolean isOverlapping(Point other) {
        return (this.x == other.x && this.y == other.y);
    }
}

public class AQ07_Comparing_Point_Objects_If_Overlapping {
    public static void main(String[] args) {
        // Create two Point objects
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);

        // Check if the points are overlapping
        if (p1.isOverlapping(p2)) {
            System.out.println("The points are overlapping.");
        }
        else {
            System.out.println("The points are not overlapping.");
        }
    }
}

/*
Output -
The points are overlapping.
 */
