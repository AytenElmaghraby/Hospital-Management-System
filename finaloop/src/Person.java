public class Person  {
    private String name;
    private int age;
    private String address;
    protected int id;


//    private Doctor d;

    public Person(String name, int age, String address, int id) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.id = id;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }




    public Person() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;

    }


    public void setId(int id) {}
}
