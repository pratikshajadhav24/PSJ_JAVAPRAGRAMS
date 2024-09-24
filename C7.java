class Car {
    String model;
    int year;

    // Default Constructor
    Car() {
        this("Unknown Model", 2000);
    }

    // Parameterized Constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", 2021);
        car1.display();
        car2.display();
    }
}

