package Constructor;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private String id;
    private int age;
    private double actualSalary;
    static String companyName = "Syntax";


    public Employee(String empName, String empDepartment, double empSalary){
        name=empName;
        department=empDepartment;
       salary= empSalary;
    }
    void printSalary(){
        double actualSalary=salary+20000+10000;
        System.out.println(actualSalary);
    }
    void calculatePrintTax(){
        double tax=actualSalary*0.3;
        System.out.println("Tax "+tax);
    }

    public static void main(String[] args) {


    }
}
