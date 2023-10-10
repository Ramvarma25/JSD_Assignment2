/*
9. If string1=”Hello World" string2=”java”, check using string methods, if 'W' is
present in first string. If present, replace word beginning with W with
string2. Output should be "Hello Java"
 */
public class AQ09_ReplaceString_Value {

    public static void main(String[] args) {
        String string1 = "Hello World";
        String string2 = "Java";

        // Check if 'W' is present in string1
        if (string1.indexOf('W') != -1) {
            // Replace the word beginning with 'W' with string2
            string1 = string1.replace("World", string2);
        }
        // Output: Hello Java
        System.out.println(string1);
    }
}
/*
Output -
Hello Java
 */

