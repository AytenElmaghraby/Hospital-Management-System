import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //صفحه ال login
        Scanner sc = new Scanner(System.in);

      System.out.print("Enter your name:");
      String name = sc.nextLine();

      System.out.print("Enter your id:");
      int id = sc.nextInt();

//      دلوقتي محتاجه fn عشان اعمل check للاسم و الرقم
        Hospital h = new Hospital();
        h.check(name, id);
//        Patient p1 = new Patient();
//        p1.setName("John");
//        p1.setAge(20);
//        p1.setAddress("sss");
//        p1.setMed("cold");
//
//        Patient p2 = new Patient();
//        p2.setName("do");
//        p2.setAge(30);
//        p2.setAddress("sss");
//        p2.setMed("cold");
//
//        Patient p3 = new Patient();
//        p3.setName("John");
//        p3.setAge(20);
//        p3.setAddress("sss");
//        p3.setMed("cold");
//        Patient p4 = new Patient("ayten",18,"sss","cold");
//
//        Employee e1 = new Employee();
//        e1.setName("John");
//
//        e1.setAge(20);
//
//
//        e1.setAddress("sss");
//
//        Employee e2 = new Employee();
//        e2.setName("do");
//        e2.setAge(30);
//        e2.setAddress("ddd");
//
//        Employee e3 = new Employee();
//        e3.setName("fdd");
//        e3.setAddress("fff");
//        e3.setAge(15);
//
//        Doctor d1 = new Doctor();
//        d1.setName("John");
//        d1.setAge(20);
//        d1.setAddress("sss");
////        e1.printInfo(d1);
//        d1.Calculatesalary(100,5);
////        d1.printMedicalRecord(p4);
//
//
//        Doctor d2 = new Doctor();
//        d2.setName("do");
//        d2.setAge(30);
//        d2.setAddress("ddd");
////        e2.printInfo(d2);
//
//
//        Doctor d3 = new Doctor();
//        d3.setName("fdd");
//        d3.setAge(15);
//        d3.setAddress("fff");
////        e3.printInfo(d3);
//
//
//        Hospital h1 = new Hospital();
//
//        Department de1 = new Department();
//        de1.searchDoctorByName("John");


//        h1.addPatient(p1);
//        h1.addEmployee(e1);
//        h1.searchEmployeeByName("John");
//        h1.searchPatientByName("John");












    }
}