/*
5. Create a class called Employee, with an ID, name and salary. The method
increaseSalary(percent) increases the salary by the given percentage. Write
the Employee class.
 */
class Employee{
    // Declaring Instance Variable
    int id;
    String name;
    double salary;

    // Taking values using constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Calculating Increment in salary using increaseSalary Method
    public void increaseSalary(double percent) {
        this.salary += this.salary * percent / 100;
    }

    // getSalary method returns the Increase value of salary
    public double getSalary() {
        return this.salary;
    }

    // Prints the Details of Employee
    public void getEmployeeDetails(){
        System.out.println("Id of Employee --> " + id);
        System.out.println("Name of the Employee --> " + name);
        System.out.println("Current salary of Employee --> " + salary);
    }
}



public class AQ05_Employee2 {
    public static void main(String[] args){
        // Creating object of Employee class
        Employee obj = new Employee(101, "Ram Varma", 50000);

        // Printing details of Employee
        obj.getEmployeeDetails();

        // Calling increaseSalary Method
        obj.increaseSalary(5);

        // Printing the salary after Increment
        System.out.println("Salary after Increment  "+obj.getSalary());
    }
}
/*
Output -
Id of Employee --> 101
Name of the Employee --> Ram Varma
Current salary of Employee --> 50000.0
Salary after Increment  52500.0
 */