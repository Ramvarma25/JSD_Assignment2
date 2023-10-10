// 8.Demonstrate methods in String and StringBuilder classes.
public class AQ08_Methods_String_StringBuilder {
    public static void main(String[] args) {
        // String methods
        String str = "Hello, World!";
        System.out.println("Original string: " + str);
        System.out.println("Length of string: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("String in upper case: " + str.toUpperCase());
        System.out.println("String in lower case: " + str.toLowerCase());

        // StringBuilder methods
        StringBuilder sb = new StringBuilder("Hello, World!");
        System.out.println("\nOriginal string builder: " + sb.toString());
        System.out.println("Length of string builder: " + sb.length());
        System.out.println("Character at index 7: " + sb.charAt(7));
        sb.append(" How are you?");
        System.out.println("Updated string builder: " + sb.toString());
        sb.insert(7, ", dear");
        System.out.println("After insertion: " + sb.toString());
        sb.delete(7, 13);
        System.out.println("After deletion: " + sb.toString());
        System.out.println("Reverse the string: "+sb.reverse());
    }
}

/*
Output -

Original string: Hello, World!
Length of string: 13
Character at index 7: W
Substring from index 7: World!
String in upper case: HELLO, WORLD!
String in lower case: hello, world!

Original string builder: Hello, World!
Length of string builder: 13
Character at index 7: W
Updated string builder: Hello, World! How are you?
After insertion: Hello, , dearWorld! How are you?
After deletion: Hello, World! How are you?
Reverse the string: ?uoy era woH !dlroW ,olleH

 */