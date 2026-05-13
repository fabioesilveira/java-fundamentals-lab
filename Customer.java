public class Customer {
    private String name;
    private int age;

    public void setName(String customerName) {
        name = customerName;
    }

    public void setAge(int customerAge) {
        age = customerAge;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}