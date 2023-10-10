/*
4. Write a program to print the area of a rectangle by creating a class named
'Rectangle' having two methods. Constructor takes length and breadth of
rectangle as parameters and the second method named as 'getArea'
returns the area of the rectangle.
 */

// Creating a class named rectangle
class Rectangle{

    // declaring two instant variables
    double length, breath;

    // parameterized constructor to get values
    Rectangle(double length, double breath){
        this.length = length;
        this.breath = breath;
    }

    // getArea method to return the area of rectangle
    public double getArea(){
        return length * breath;
    }
}
public class AQ04_Rectangle {
    public static void main(String[] args){
        //Creating the object of class rectangle & passing the values to the constructor
        Rectangle rec = new Rectangle(10,5);

        //calling the getArea method
        System.out.println("Area of a Rectangle " + rec.getArea());
    }
}
/*
Output -
Area of a Rectangle 50.0
 */