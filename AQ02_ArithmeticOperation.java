/*
2. Create a class which contains static methods for finding the sum and
difference of two numbers.
 */

public class AQ02_ArithmeticOperation {

    //Declaring static methods
    public static int sum(int a, int b){
        return a+b;
    }


    public static int diff(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        int number1 = 40;
        int number2 = 12;

        //Calling method
        System.out.println("Sum of Two Numbers "+sum(number1,number2));
        System.out.println("Difference Between Two Numbers "+diff(number1,number2));
    }
}


/*

Output -
Sum of Two Numbers 52
Difference Between Two Numbers 28

 */