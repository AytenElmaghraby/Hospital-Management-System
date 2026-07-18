import java.util.ArrayList;

public class Doctor extends Employee {


   private Department myDepartment;

    private static ArrayList<Integer> Doctors = new ArrayList<>();
    private static int Counter;

//private int id =Counter;


    public Doctor() {

        Counter++;

        Doctors.add(Counter);
    }


    public int getId() {
        return id=this.Counter;
    }


    public Doctor(String name, int age, String address, double salary ,String HireDate) {
        super(name, age, address, salary, HireDate);
        Counter++;
        Doctors.add(Counter);
    }

    public Doctor(String name) {

        super(name);
        Counter++;
        Doctors.add(Counter);
    }


    public Department getDepartment() {
        return myDepartment;
    }

    public void setDepartment(Department department) {
        myDepartment = department;
    }


    public void printMedicalRecord(Patient p) {

        System.out.println("Patient Report: \nName:"+p.getName()+"\nAge:" + p.getAge() +"\n Address:" + p.getAddress()+"\nDisease: "+p.getMed()+"\nID:"+p.getId());

    }




























    }









