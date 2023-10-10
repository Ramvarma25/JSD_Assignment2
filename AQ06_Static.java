// 6. Write a program to demonstrate static variable.
public class AQ06_Static {

    // Static variable
    static int count = 0;

    // Constructor
    public AQ06_Static() {
        // Increment the static variable by 1 whenever a new object is created
        count++;
    }

    public static void main(String[] args) {
        // Create objects
        AQ06_Static obj1 = new AQ06_Static();
        AQ06_Static obj2 = new AQ06_Static();
        AQ06_Static obj3 = new AQ06_Static();

        // The static variable 'count' will be the same for all objects and show the total number of objects created
        System.out.println("Number of objects created: " + count);
    }
}

/*
Output -
Number of objects created: 3
 */

