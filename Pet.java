public class Pet {
   // TODO: Declare private fields
   private String name;
   private String type;
   private int age;

   // TODO: Define no-arg constructor
   public Pet() {
      name = "unknown";
      type = "unknown";
      age = 0;
   }

   // TODO: Define overloaded constructor
   public Pet(String petName, String petType, int petAge) {
      name = petName;
      type = petType;
      age = petAge;
   }

   // TODO: Define getter (accessor) methods and setter (mutator) methods
   public void setName(String petName) {
      name = petName;
   }

   public void setType(String petType) {
      type = petType;
   }

   public void setAge(int petAge) {
      age = petAge;
   }

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