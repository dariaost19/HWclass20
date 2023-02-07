package Homework16;

public class Employee {
    //2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
    //Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    //Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    //Test your code!
    String name;
    String ID;
    int yearsOfEmployment;
    Employee(String name,String ID, int yearsOfEmployment){
        this.name=name;
        this.ID=ID;
        this.yearsOfEmployment=yearsOfEmployment;
    }
    void Employed(){
        System.out.println("Employee " +name+ ID+ " is employed for " +yearsOfEmployment);
    }
}
class FulltimeEmployee extends Employee{

    String position;
    boolean fullTime;
    FulltimeEmployee(String name,String ID,int yearsOfEmployment,String position,boolean fullTime){
        super(name,ID,yearsOfEmployment);
        this.fullTime=fullTime;
        this.position=position;
    }
    void FulltimeEmployment(){
        System.out.println("Employee "  +name + ID+ " is a Full Time employee " +fullTime);
    }
    void paidDays(){
        System.out.println("Have a paid holidays and sick days");
    }
}
class PartTimeEmployee extends Employee{
    int workingHours;
    PartTimeEmployee(String name,String ID, int yearsOfEmployment,int workingHours){
        super(name,ID,yearsOfEmployment);
        this.workingHours=workingHours;
    }
    void PartTimeEmployement(){
        System.out.println("Employee " +name +ID+ " is a part-time employee , working " +workingHours + " a week");
    }
    void HealthInsurance(){
        System.out.println("Does not have health insurance benefits");
    }
}
