class Student {
    String name = "Nivetha";
    int age = 20;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Student s = new Student(); 
        s.display();
    }
}
