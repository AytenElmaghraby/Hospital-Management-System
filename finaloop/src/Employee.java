import org.w3c.dom.css.Counter;

import java.util.ArrayList;

public class Employee extends  Person {

    private double salary;
    private String HireDate;



    private static ArrayList<Integer> employee = new ArrayList<>();
    private static int Counter=100;


    public Employee() {

        Counter++;
        employee.add(Counter);

    }


    public Employee(String name, int age, String address, double salary,String HireDate ) {
        super(name, age, address);
        this.salary = salary;
        this.HireDate = HireDate;
        Counter++;
        employee.add(Counter);
    }

   public Employee(String name){

       Counter++;
       employee.add(Counter);
   }

    public double getSalary() {
        return salary;
    }

    public String getHireDate() {
        return HireDate;
    }

    public void setHireDate(String hireDate) {
        HireDate = hireDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void Calculatesalary(double salary) { //overloading
        double percentage =1;
        System.out.println("Salary ="+(salary*percentage));  ;

    }
    public void Calculatesalary(double salary,double percentage) {
        System.out.println("Salary ="+(salary*percentage));  ;
    }


    public void printInfo(Doctor d) {
        System.out.println("Personal Info: \nName:"+d.getName()+"\nAge:" + d.getAge() +"\n Address:" + d.getAddress()+"\nSalary: "+d.getSalary() +"\n ID:"+d.getId());

    }














}





