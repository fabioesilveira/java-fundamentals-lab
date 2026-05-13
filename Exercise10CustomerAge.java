import java.util.Scanner;

public class Exercise10CustomerAge {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        Customer customer1 = new Customer();

        Customer customer2 = new Customer();

        // TODO: Declare name and age variables (String, and int)
        String name = " ";
        int age = 0;

        // TODO: Read name and age input for customer 1
        name = scnr.next();
        age = scnr.nextInt();

        // TODO: Set customer 1 name and age fields using mutator methods
        customer1.setName(name);
        customer1.setAge(age);

        // (setName() and setAge())

        // TODO: Read name and age input for customer 2
        name = scnr.next();
        age = scnr.nextInt();

        // TODO: Set customer 2 name and age fields using mutator methods
        customer2.setName(name);
        customer2.setAge(age);

        // (setName() and setAge())

        System.out.println("Customer that is older:");

        // TODO: Determine older customer (use getAge())
        if (customer1.getAge() > customer2.getAge()) {
            customer1.printInfo();
        } else {
            customer2.printInfo();
        }
        // and output older customer's info (use printInfo())
        scnr.close();
    }
}
