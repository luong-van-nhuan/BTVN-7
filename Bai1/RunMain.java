package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person person1 = new Employee("Trung", "HN", 330);
        Person person2 = new Customer("Linh", "BN", 10400);
        person1.display();
        person2.display();
    }
}

