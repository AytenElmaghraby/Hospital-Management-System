import java.util.ArrayList;

public class Patient extends Person {

    private String med;
    private static ArrayList<Integer> Patient = new ArrayList<>();
    private static int Counter=300;
    private static int id;
    public Patient() {
        Counter++;
        Patient.add(Counter);

    }


    public Patient(String name, int age, String address,String med) {
        super(name, age, address);
        this.med = med;
        Counter++;
        Patient.add(Counter);
    }

    public Patient(String ayten, int age, String sss) {
        super(ayten, age, sss);
        Counter++;
        Patient.add(Counter);
    }


    public int getId() { //overriding

        return Counter;

    }
    public void setId() {

        this.id = Counter;
    }

    public String getMed() {
        return med;

    }

    public void setMed(String med) {
        this.med = med;
    }





}



