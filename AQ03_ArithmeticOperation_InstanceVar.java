/*
3. Create a class which contains 2 instance variables a, b. Write instance
methods for finding the sum and difference of 2 variables.
 */

class MyClass {

    //Declaring Instance Variable
    int a;
    int b;

    public int sum() {
        return a + b;
    }

    public int difference() {
        return a - b;
    }
}

public class AQ03_ArithmeticOperation_InstanceVar {
    public static void main(String[] args) {
        // Creating Object of class MyClass
        MyClass obj = new MyClass();

        //Initializing Variables
        obj.a = 10;
        obj.b = 5;

        System.out.println("Sum: " + obj.sum());
        System.out.println("Difference: " + obj.difference());
    }
}

/*

Output -
Sum: 15
Difference: 5

 */