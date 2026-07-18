import java.util.ArrayList;

public class Department {

    //composition
    private Doctor d;
    private ArrayList<Doctor> doctors = new ArrayList<>();



        public void addDoctor(Doctor d) {
            doctors.add(d);
            System.out.println("Sucsses");
        }


    public void searchDoctorByName(String name) {//linear search
        for (Doctor d : doctors) {
            if (d.getName().equals(name)) {
                System.out.print("Found");
            }

            else  {
                System.out.print("Not Found");
            }

        }



    }



}
