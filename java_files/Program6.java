class A {
    void showA() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("This is class B");
    }
}

public class Program6 {
    public static void main(String[] args) {
        B obj = new B();
        obj.showA();
        obj.showB();
    }
}
