import java.util.ArrayList;

public class Hospital {

    private String name;
    private String id;
    private Patient p;

    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Employee> employee = new ArrayList<>();



    public void addPatient(Patient p) { //Associaion
        patients.add(p);

        System.out.println("Sucsses");
    }

    public void addEmployee(Employee e) {
        employee.add(e);
        System.out.println("Sucsses");

    }



    public void searchPatientByName(String name) { //linear search
        for (Patient p : patients) {
            if (p.getName().equals(name)) {
                System.out.print("Found");
            }

            else  {
                System.out.print("Not Found");
            }

        }



    }



    public void searchEmployeeByName(String name) {//linear search
        for (Employee e : employee) {
            if (e.getName().equals(name)) {
                System.out.print("Found");
            } else {
                System.out.print("Not Found");
            }

        }
    }


    //    هعمل fn عشان تعمل ال check
        public void check (String name , int id) {

            //لو مثلا هميز ان االدكاتره الid اكبر من 20 والموظفين  اقل من ال20

            if (id < 100) System.out.println ("Welcome Doctor ");
            else if(id < 300 && id>=100 ) System.out.println (" Welcome Employee ");
            else System.out.println("Invalid name or ID");


        }


}







