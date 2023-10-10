/*
1. Create a class named 'Employee' with String variable 'name' and integer
variable 'id'. Create two objects with id and name initialized and print these
details.
 */

// Creating class named employee

class Employee{
    String  name;
    int id;
}

public class AQ01_Employee {
    public static void main(String[] args){

        //Creating Object of the class employee & Initializing the variable
        Employee emp1 = new Employee();
        emp1.name = "Ram Varma";
        emp1.id = 101;

        Employee emp2 = new Employee();
        emp2.name = "Kishan";
        emp2.id = 102;


        // printing details
        System.out.println("Details of Employee 1");
        System.out.println(emp1.name);
        System.out.println(emp1.id);

        System.out.println("Details of Employee 2");
        System.out.println(emp2.name);
        System.out.println(emp2.id);
    }
}


/*

Output -
Details of Employee 1
Ram Varma
101

Details of Employee 2
Kishan
102

 */