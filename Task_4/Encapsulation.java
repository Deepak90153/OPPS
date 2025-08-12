package Task_4;

public class Encapsulation {
    private String name;
    private int age;
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        } else {
            System.out.println("Age must be positive.");
        }
    }
        public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("Deepak");
        obj.setAge(20);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}