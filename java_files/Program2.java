class Car {
    String brand;

    Car(String b) {
        brand = b;
    }

    void show() {
        System.out.println("Car brand: " + brand);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Car c = new Car("Honda");
        c.show();
    }
}
