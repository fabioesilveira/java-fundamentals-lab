public class Exercise12Pet {
    // 1. Declare the private fields here
    private String name;
    private String type;
    private int age;

    // 2. Create the no-argument constructor here
   public Exercise12Pet() {
      name = "unknown";
      type = "unknown";
      age = 0;
   }

    // 3. Create the overloaded constructor here
    public Exercise12Pet(String petName, String petType, int petAge) {
        name = petName;
        type = petType;
        age = petAge;
    }

    // 4. Create the setter methods here

    public void setName(String petName) {
        name = petName;
    }

    public void setType(String petType) {
        type = petType;
    }

    public void setAge(int petAge) {
        age = petAge;
    }
    // 5. Create the getter methods here

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }
}
